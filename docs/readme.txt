[itpub.net]Android Programming Tutorials 3rd Edition
====================================================

2012.07.13
----------

   14:00 - 14:52
   15:02 -

   1. ��9������,ͨ���ж� AtomicBoolean ,���ж������к�̨����

   2. 11. ͨ��sqlite��������

   3. 12. list,form,�໥���ݲ���

   Intent i=new Intent(LunchList.this, DetailForm.class);
   i.putExtra(ID_EXTRA, String.valueOf(id));
   startActivity(i);

   ����
   restaurantId=getIntent().getStringExtra(LunchList.ID_EXTRA);

   4. 13
   PreferenceActivity
   SharedPreferences
   ��������

   �����仯��ʱ����
   prefs.registerOnSharedPreferenceChangeListener(prefListener);

   5. p174

   6. 14. ����״̬��Ϣ

   onSaveInstanceState
   onRestoreInstanceState

   7. 15. feed

   8. 16. IntentService
   IntentService is a base class for Services that handle asynchronous requests (expressed as Intents) on demand.

   FeedActivity �е��ø÷���
   if (state==null) {
      state=new InstanceState();
      state.handler=new FeedHandler(this);

      Intent i=new Intent(this, FeedService.class);

      i.putExtra(FeedService.EXTRA_URL,
                 getIntent().getStringExtra(FEED_URL));
      i.putExtra(FeedService.EXTRA_MESSENGER,
                 new Messenger(state.handler));

      startService(i);

   9. ��̨�������ɲο�
   RestaurantHelper

   10. 17. GPS

   11. 18.
   Map

   12. 19. ���ӹ���
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

   14. 20. ������Ϣ

2012.07.12
----------

   1. ��7������,onCreateOptionsMenu,�˵���ʾ�谴��һ����

   2. p92

2012.07.11
----------

   1. p64

   --END