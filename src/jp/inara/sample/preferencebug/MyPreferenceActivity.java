
package jp.inara.sample.preferencebug;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class MyPreferenceActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getData().toString().equals("preferences://preference2")) {
            addPreferencesFromResource(R.xml.preference2);
        } else {
            addPreferencesFromResource(R.xml.preference);
        }
    }

}
