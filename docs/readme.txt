[itpub.net]Android Programming Tutorials 3rd Edition
====================================================

2012.07.13
----------

   14：00 - 14:52

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

2012.07.12
----------

   1. 第7个例子,onCreateOptionsMenu,菜单显示需按第一个键

   2. p92

2012.07.11
----------

   1. p64

   --END