package cn.seimo.fkelonmask

import android.content.res.XResources
import android.graphics.drawable.Drawable
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.IXposedHookZygoteInit
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.callbacks.XC_LoadPackage

class MainHook : IXposedHookZygoteInit, IXposedHookLoadPackage {
    override fun initZygote(startupParam: IXposedHookZygoteInit.StartupParam) {
        // 初始化资源替换
        XResources.setSystemWideReplacement("com.twitter.android", "drawable", "twitter_logo", object : XC_MethodHook() {
            override fun afterHookedMethod(param: MethodHookParam) {
                // 替换图标资源
                val res: XResources = param.thisObject as XResources
                val resName: String = param.args[0] as String
                val resId: Int = res.getIdentifier(resName, "drawable", "com.twitter.android")

                // 在这里替换为你想要的图片资源
                val newDrawable: Drawable? = res.getDrawable(R.drawable.twitter_logo)

                if (newDrawable != null) {
                    param.result = newDrawable
                }
            }
        })
        XResources.setSystemWideReplacement("com.twitter.android", "drawable", "twitter_logo_white", object : XC_MethodHook() {
            override fun afterHookedMethod(param: MethodHookParam) {
                // 替换图标资源
                val res: XResources = param.thisObject as XResources
                val resName: String = param.args[0] as String
                val resId: Int = res.getIdentifier(resName, "drawable", "com.twitter.android")

                // 在这里替换为你想要的图片资源
                val newDrawable: Drawable? = res.getDrawable(R.drawable.twitter_logo_white)

                if (newDrawable != null) {
                    param.result = newDrawable
                }
            }
        })
        XResources.setSystemWideReplacement("com.twitter.android", "mipmap", "ic.launcher_twitter", object : XC_MethodHook() {
            override fun afterHookedMethod(param: MethodHookParam) {
                // 替换图标资源
                val res: XResources = param.thisObject as XResources
                val resName: String = param.args[0] as String
                val resId: Int = res.getIdentifier(resName, "mipmap", "com.twitter.android")

                // 在这里替换为你想要的图片资源
                val newDrawable: Drawable? = res.getDrawable(R.mipmap.ic_launcher_twitter)

                if (newDrawable != null) {
                    param.result = newDrawable
                }
            }
        })
        XResources.setSystemWideReplacement("com.twitter.android", "mipmap", "ic_launcher_twitter_foreground", object : XC_MethodHook() {
            override fun afterHookedMethod(param: MethodHookParam) {
                // 替换图标资源
                val res: XResources = param.thisObject as XResources
                val resName: String = param.args[0] as String
                val resId: Int = res.getIdentifier(resName, "mipmap", "com.twitter.android")

                // 在这里替换为你想要的图片资源
                val newDrawable: Drawable? = res.getDrawable(R.mipmap.ic_launcher_twitter_foreground)

                if (newDrawable != null) {
                    param.result = newDrawable
                }
            }
        })
        XResources.setSystemWideReplacement("com.twitter.android", "mipmap", "ic_launcher_twitter_round", object : XC_MethodHook() {
            override fun afterHookedMethod(param: MethodHookParam) {
                // 替换图标资源
                val res: XResources = param.thisObject as XResources
                val resName: String = param.args[0] as String
                val resId: Int = res.getIdentifier(resName, "mipmap", "com.twitter.android")

                // 在这里替换为你想要的图片资源
                val newDrawable: Drawable? = res.getDrawable(R.mipmap.ic_launcher_twitter_round)

                if (newDrawable != null) {
                    param.result = newDrawable
                }
            }
        })


    }

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam?) {
        TODO("Not yet implemented")
    }
}