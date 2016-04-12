package com.mikeroelens.emojification;


import android.content.Context;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MidGameScreen extends BaseContentScreen {
    public interface MidGameScreenListener {
        void onStopGame();
    }

    View mView;
    private MidGameScreenListener mMidGameScreenListener;

    public MidGameScreen(Context context, MidGameScreenListener midGameScreenListener) {
        super(context);
        mMidGameScreenListener = midGameScreenListener;

        init();
    }

    private void init() {
        mView = inflateById(R.layout.mid_game_screen);
        ButterKnife.bind(this, mView);
    }

    @Override
    View getContentView() {
        return mView;
    }

    @OnClick(R.id.btnStop)
    public void onStopClicked() {
        mMidGameScreenListener.onStopGame();
    }
}
