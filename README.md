<h2>Git URL</h2>
https://github.com/merbin2012/cordova-plugin-codeplay-browsertab


<h2>Browser custom tab</h2>
Currently this plugin can be used for chrome, firefox, opera browser. Will open the browser choose menu, if the given browser not installed in the users mobile.


<h2>How to Instalation?</h2>
<h4>Using the Cordova CLI</h4>
<blockquote>
  $ cordova plugin add cordova-plugin-codeplay-browsertab
</blockquote>


<h4>Using the phonegap CLI</h4>
<blockquote>
  $ phonegap local plugin add cordova-plugin-codeplay-browsertab
</blockquote>

<h2>How to Uninstall?</h2>
<h4>Using the Cordova CLI</h4>
<blockquote>
  $ cordova plugin rm cordova-plugin-codeplay-browsertab
</blockquote>

<h4>Using the phonegap CLI</h4>
<blockquote>
  $ phonegap local plugin rm cordova-plugin-codeplay-browsertab
</blockquote>


<h4>Syntax</h4>

```javascript
var option= {
    link:"https://tutorialcodeplay.com"
    ,browsertype:  0|1|2|3 
};

cordova.plugins.browsertab.open(option,successCallback,errorCallback);

function successCallback(result)
{
	alert(result);
}
function errorCallback(message)
{
	alert(message);
}
```





<h4>Example</h4>

```javascript

var option= {
    link:"https://tutorialcodeplay.com"
    ,browsertype:  0
};

cordova.plugins.browsertab.open(option,successCallback,errorCallback);

function successCallback(result)
{
	alert(result);
}
function errorCallback(message)
{
	alert(message);
}
```

<h4>browsertype</h4>
<h3>1) 0=> Choose browser</h3>
<p>Will user to ask choose the browser.</p>

<h4>Screenshot</h4>
<p  align="center">
  <img src="https://lh3.googleusercontent.com/-UdK2fz99uS4/YXOaGrvtUKI/AAAAAAAASrg/NlkBlH-U0p0cEIvk7iCi6b2D8NrFD4UVwCLcBGAsYHQ/s16000/Screenshot_2021-10-23-10-38-04-776_android.jpg" width="350" alt="Open url in browser tab">
</p>


<h3>2) 1=> Chrome browser</h3>
<p>Given website will open with chrome browser tab. Will open the popup to choose the browser, if the user doesn't have the chrome browser on their mobile.</p>

<h4>Screenshot</h4>
<p  align="center">
  <img src="https://lh3.googleusercontent.com/-eyC4MAo8h7g/YXOaGpRdnSI/AAAAAAAASro/qLAaLmEHaK4yg7NeAW-V2cu4sFlhjJxrACLcBGAsYHQ/s16000/Screenshot_2021-10-23-10-38-42-967_com.android.chrome.jpg" width="350" alt="Chrome browser tab">
</p>



<h3>3) 2=> Firefox browser</h3>
<p>Given website will open with firefox browser tab. Will open the popup to choose the browser, if the user doesn't have the firefox browser on their mobile.</p>

<h4>Screenshot</h4>
<p  align="center">
  <img src="https://lh3.googleusercontent.com/-oonMppEBpCQ/YXOaGjZn5-I/AAAAAAAASrk/2diqHGUvYxA-6HFKDsFhyrDfcBxtbH0iQCLcBGAsYHQ/s16000/Screenshot_2021-10-23-10-38-58-919_org.mozilla.firefox.jpg" width="350" alt="Firefox browser tab">
</p>




<h3>4) 3 => Opera browser</h3>
<p>Given website will open with opera browser tab. Will open the popup to choose the browser, if the user doesn't have the opera browser on their mobile.</p>

<h4>Screenshot</h4>
<p  align="center">
  <img src="https://lh3.googleusercontent.com/-fcJV2k9vs7Q/YXOaGmVRrnI/AAAAAAAASrs/TFxSs6y0KqsOCKTpjbwtwEFFW2_E_e00gCLcBGAsYHQ/s16000/Screenshot_2021-10-23-10-41-38-503_com.opera.browser.jpg" width="350" alt="Opera browser tab">
</p>	






<h2>Support Platfrom</h2>
<ul>
<li>Android</li>
</ul>
