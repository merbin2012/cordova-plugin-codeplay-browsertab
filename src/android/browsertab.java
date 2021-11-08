package cordova.plugin.codeplay.browsertab;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.text.TextUtils;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * This class echoes a string called from JavaScript.
 */
public class browsertab extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {


        try {
            JSONObject opts = args.optJSONObject(0);
            String link = opts.optString("link");
            Integer browsertype = Integer.parseInt(opts.optString("browsertype"));
            //Boolean enableShareButton = Boolean.parseBoolean(opts.optString("enableShareButton"));


            String packageid = "";
            if (browsertype == 0)
                packageid = "";
            if (browsertype == 1)
                packageid = "com.android.chrome";
            else if (browsertype == 2)
                packageid = "org.mozilla.firefox";
            else if (browsertype == 3)
                packageid = "com.opera.browser";

            String url = link;
            Uri uri = Uri.parse(url);

            String PACKAGE_NAME = packageid;//"com.android.chrome";//"org.mozilla.firefox_beta";//"org.mozilla.firefox"; //"org.mozilla.firefox"; //"com.opera.browser";

            CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder().build();


        /*
                if(enableShareButton) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                // add share action to menu list
                builder.addDefaultShareMenuItem();
                }
        */
            customTabsIntent.intent.setData(uri);


            PackageManager packageManager = cordova.getActivity().getPackageManager();
            List<ResolveInfo> resolveInfoList = packageManager.queryIntentActivities(customTabsIntent.intent, PackageManager.MATCH_DEFAULT_ONLY);


            for (ResolveInfo resolveInfo : resolveInfoList) {
                String packageName = resolveInfo.activityInfo.packageName;
                if (TextUtils.equals(packageName, PACKAGE_NAME))
                    customTabsIntent.intent.setPackage(PACKAGE_NAME);
            }


            customTabsIntent.launchUrl(cordova.getActivity(), uri);
            callbackContext.success("success");
            return true;
        }
        catch (RuntimeException e)
        {
            callbackContext.error(e.getMessage());
            return false;
        }


    }

}
