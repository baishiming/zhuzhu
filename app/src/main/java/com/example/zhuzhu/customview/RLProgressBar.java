package com.example.zhuzhu.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.zhuzhu.R;

/**
 * @author bsm
 * @name zhuzhu
 * @class name：com.example.zhuzhu.customview
 * @class describe
 * @time 2020/9/25 21:06
 */
public class RLProgressBar extends RelativeLayout {

    private Context mContent;
    private double mProgressBarMax = 100.0;
    private double mCurrentPosition = 0.0;
    public ProgressBar pb_box;
    public ImageView iv_pb_thumb;
    public RelativeLayout rl_box_pb;

    public RLProgressBar(Context context) {
        super(context);
    }

    public RLProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public RLProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }


    private int pbWidth = 0;
    private int rlWidth = 0;

    private void init(Context context, AttributeSet attrs) {
        mContent = context;
        LayoutInflater.from(context).inflate(R.layout.rl_progress_bar, this, true);
        initViewHolder();

    }

    private LayoutParams lpIvthumb;
    private int ivWidth = 0;
    private double onePositionWidth = 0;
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e("bsm","getMeasuredWidth()=="+getMeasuredWidth());
        pbWidth = rl_box_pb.getWidth();
        Log.e("bsm","pbWidth=="+pbWidth);
        pbWidth = pb_box.getMeasuredWidth();
        Log.e("bsm","pbWidth=="+pbWidth);
        RelativeLayout.LayoutParams layoutParams = (LayoutParams) rl_box_pb.getLayoutParams();
        rlWidth = layoutParams.width;

        Log.e("bsm","rlWidth=="+rlWidth);
        int leftMargin = layoutParams.leftMargin;
        Log.e("bsm","leftMargin=="+leftMargin);

        onePositionWidth = pbWidth / mProgressBarMax;
        Log.e("bsm","onePositionWidth=="+onePositionWidth);

        lpIvthumb = (LayoutParams) iv_pb_thumb.getLayoutParams();

        ivWidth = iv_pb_thumb.getMeasuredWidth();
        Log.e("bsm","ivWidth=="+ivWidth);
    }

    public void setPosition(int position) {
        pb_box.setProgress(position);
        setLayoutParams(position);
    }


    public void setLayoutParams(int position) {
        if (lpIvthumb == null) {
            throw new NullPointerException("Layout parameters cannot be null");
        }
        lpIvthumb.leftMargin = (int) ( onePositionWidth * position);
        if(lpIvthumb.leftMargin >= pbWidth - ivWidth){
            lpIvthumb.leftMargin = pbWidth - ivWidth;
        }
        iv_pb_thumb.setLayoutParams(lpIvthumb);
        requestLayout();
    }


    public void initViewHolder() {
        this.pb_box = (ProgressBar) findViewById(R.id.pb_box);
        this.iv_pb_thumb = (ImageView) findViewById(R.id.iv_pb_thumb);
        this.rl_box_pb = (RelativeLayout) findViewById(R.id.rl_box_pb);
    }

    public void setThumbIcon(int drawableId){
        iv_pb_thumb.setImageResource(drawableId);
    }

}
