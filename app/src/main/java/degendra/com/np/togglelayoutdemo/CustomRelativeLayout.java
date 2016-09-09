package degendra.com.np.togglelayoutdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class CustomRelativeLayout extends RelativeLayout
        implements View.OnClickListener {
    private static final String TAG = CustomRelativeLayout.class.getSimpleName();

    public CustomRelativeLayout(Context context) {
        super(context);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "Test");
        setOnClickListener(this);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "CustomRelativeLayout. onClicked");
        ((RadioGroup)v.getParent()).check(v.getId());
    }

    @Override
    public boolean performClick() {
        ((RadioGroup)this.getParent()).check(this.getId());
        return super.performClick();
    }
}
