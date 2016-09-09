package degendra.com.np.togglelayoutdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RadioGroup;

public class CustomLinearLayout extends RadioGroup implements RadioGroup.OnCheckedChangeListener {
    private static final String TAG = CustomLinearLayout.class.getSimpleName();

    public CustomLinearLayout(Context context) {
        super(context);
    }

    public CustomLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "Test");
        setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        for(int i = 0; i < group.getChildCount(); i++)
        {
            if (group.getChildAt(i).getId() == checkedId) {
                group.getChildAt(i).setSelected(true);
            } else {
                group.getChildAt(i).setSelected(false);
            }
        }
    }
}
