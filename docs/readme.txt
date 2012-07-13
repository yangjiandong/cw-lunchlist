[itpub.net]Android Programming Tutorials 3rd Edition
====================================================

2012.07.13
----------

   14:00 - 14:52
   15:02 -

   1. 第9个例子,通过判断 AtomicBoolean ,可中断运行中后台任务

   2. 11. 通过sqlite保存数据

   3. 12. list,form,相互传递参数

   Intent i=new Intent(LunchList.this, DetailForm.class);
   i.putExtra(ID_EXTRA, String.valueOf(id));
   startActivity(i);

   接受
   restaurantId=getIntent().getStringExtra(LunchList.ID_EXTRA);

   4. 13
   PreferenceActivity
   SharedPreferences
   参数设置

   参数变化后及时更新
   prefs.registerOnSharedPreferenceChangeListener(prefListener);

   5. p174

   6. 14. 保存状态信息

   onSaveInstanceState
   onRestoreInstanceState

   7. 15. feed

   8. 16. IntentService
   IntentService is a base class for Services that handle asynchronous requests (expressed as Intents) on demand.

   FeedActivity 中调用该服务
   if (state==null) {
      state=new InstanceState();
      state.handler=new FeedHandler(this);

      Intent i=new Intent(this, FeedService.class);

      i.putExtra(FeedService.EXTRA_URL,
                 getIntent().getStringExtra(FEED_URL));
      i.putExtra(FeedService.EXTRA_MESSENGER,
                 new Messenger(state.handler));

      startService(i);

   9. 后台表升级可参考
   RestaurantHelper

   10. 17. GPS

   11. 18.
   Map

   12. 19. 闹钟功能
   TimePreference

   OnBootReceiver extends BroadcastReceiver
   onReceive()

   manifest:
    <receiver android:enabled="false"
              android:name=".OnBootReceiver">
      <intent-filter>
        <action android:name="android.intent.action.BOOT_COMPLETED" />
      </intent-filter>
    </receiver>

   13. p274

   14. 20. 发送消息

2012.07.12
----------

   1. 第7个例子,onCreateOptionsMenu,菜单显示需按第一个键

   2. p92

2012.07.11
----------

   1. p64

   --END