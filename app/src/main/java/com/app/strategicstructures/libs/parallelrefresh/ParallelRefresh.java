package com.app.strategicstructures.libs.parallelrefresh;

import android.os.Handler;

public class ParallelRefresh {
    private final Content content;
    private boolean runStatus;

    public ParallelRefresh(Content content) {
        this.content = content;
        runStatus = true;
        refresh();
    }

    public void stop() { runStatus = false; }

    public void resume() { runStatus = true; }

    public boolean isResumed() { return runStatus; }

    private void contents() {
        this.content.content();
        refresh();
    }

    private void refresh() {
        if (runStatus) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() { contents(); }
            }, 1);
        }
    }
}
