package com.wangjie.testrecycle;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2016/4/2.
 */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SpacesItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = space;
        }
    }

    /**
     * @param c
     * @param parent
     * @param state
     * @Override public void onDraw(Canvas c, RecyclerView parent, State state) {
     * <p/>
     * }
     * }
     */

}
