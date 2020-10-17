package id.kasandra.retail.welcome;

import android.view.View;

public class NextButton extends WelcomeScreenViewWrapper {

    private boolean shouldShow = true;

    public NextButton(View button) {
        super(button);
    }

    @Override
    public void setup(WelcomeScreenConfiguration config) {
        super.setup(config);
        this.shouldShow = config.getShowNextButton();
    }

    @Override
    public void onPageSelected(int pageIndex, int firstPageIndex, int lastPageIndex) {
        setVisibility(shouldShow && pageIndex != lastPageIndex);
    }
}
