# 焦点新闻APP
### 新闻客户端源码
- 1.自动更新抓取谷歌新闻
- 2.新闻内容为JSON格式,参考[链接](http://121.42.138.77:8081/query?type=1)
- 3.添加了用户系统：包括用户注册、登陆、收藏、顶新闻、踩新闻的功能[正在添加]
- 4.apk下载链接：[apk链接](https://github.com/lixiang0/NewsAPP/blob/master/app-debug.apk)
- 5.登录则可以添加新闻;未登录则显示新闻信息。[链接](http://news.rubenxiao.com/)
- 6.获取新闻接口：[示例：获取国际新闻第一页](http://121.42.138.77:8081/query?type=1&page=1)


## APP和网页界面
<p align="center"><img src="app.png" width="400"  align="middle"/><img src="web.png" width="400"  align="middle"/></p>



## 新闻内容格式：
```
[{"id":0,"time":"Fri, 08 Dec 2017 06:13:00 GMT","title":"内蒙古24个项目入选“2017全国优选旅游项目” - 新浪网","category":"国际/港台","link":"http://news.sina.com.cn/c/2017-12-08/doc-ifypnqvn1474616.shtml","description":"在近日召开的2017年全国旅游投融资促进大会上，国家旅游局会同国家开发银行等12家金融机构综合考虑项目成熟度、开工条件、市场前景、示范引领和带动作用，共同遴选推出了全国680个优选旅游项目，主要包括景区提升改造 ...","img":"t0.gstatic.com/images?q\u003dtbn:ANd9GcRJc023FTqF3wtzBsmcYiikyr7kKQeY9L7FPu7CUO-WcIU6f9aH7_dO-z5LX-hJgD700LZz86QF"},
{"id":0,"time":"Fri, 08 Dec 2017 01:10:37 GMT","title":"美国14年后再发全球警告吁海外公民保持高度警觉 - 中国新闻网","category":"国际/港台","link":"http://www.chinanews.com/gj/2017/12-08/8395428.shtml","description":"中新网12月8日电据美媒报道，在美国总统特朗普6日宣布将承认耶路撒冷为以色列首都并开始把美国大使馆迁移到那里之后，美国国务院7日发出全球警告。 美国国务院的通告说，“美国政府在全球的设施提高戒备状态。这些设施 ...","img":""},
{"id":0,"time":"Fri, 08 Dec 2017 03:46:15 GMT","title":"非洲之津巴布韦：翻篇的一年 - 新华网","category":"国际/港台","link":"http://news.xinhuanet.com/2017-12/08/c_1122080013.htm","description":"总统宝座易主，无疑是南部非洲国家津巴布韦２０１７年的最大变化。已执掌权杖３７年并称要执政到９９岁的罗伯特·穆加贝１１月２１日宣布辞去总统职务，为“穆加贝时代”画上句号。 １１月１５日凌晨１时左右，津巴布韦首都哈拉雷市区传出 ...","img":"t1.gstatic.com/images?q\u003dtbn:ANd9GcSJMR-EVQM3n2n8NqN-0vOXEZPISbddcHqC-zsG6gRM24jCuSo0DuecK0gnTb4vZGCuF-MBZXUO"},
{"id":0,"time":"Fri, 08 Dec 2017 04:27:25 GMT","title":"非法“占中”头目黄之锋等人判刑日期再押后律师求情：他当年才18.... - 新浪网","category":"国际/港台","link":"http://news.sina.com.cn/c/2017-12-08/doc-ifypnyqi1966363.shtml","description":"... 【环球网综合报道】香港高等法院原定12月7日下午对非法“占中”期间涉嫌“刑事藐视法律罪”的黄之锋一众16人判刑。不过据港媒报道，黄之锋律师骆应淦7日出庭时向法官“求情”，称被告当时只有18岁，而且已被判刑半年，希 ...","img":"t1.gstatic.com/images?q\u003dtbn:ANd9GcTs-YhvT8KROWVkIPSlA6SckTqD4VZc_T3WixWIIdqYFeNLTOrwRxASVsPopFv0a2qylDhI-CTa"},
{"id":0,"time":"Fri, 08 Dec 2017 02:28:02 GMT","title":"裕仁天皇二战回忆录拍卖，成交价27.5万美元 - 纽约时报中文网","category":"国际/港台","link":"https://cn.nytimes.com/asia-pacific/20171208/japan-emperor-hirohito-memoirs/","description":"东京——周三，日本战争时期的天皇裕仁(Hirohito)的回忆录手稿在纽约拍得27.5万美元（约合180万元人民币）。裕仁在回忆录中解释了日本参加“二战”的原因。 这份回忆录由日本的一名法庭官员用铅笔和黑色墨水手写而成，涉 ...","img":"t2.gstatic.com/images?q\u003dtbn:ANd9GcS1lpbqaMR2PAr-h0B7FEDBvi6u7BBxTprHnj2KJmGqstBvd8UU7j5raCKfP_YOn8loU3ENC_eR"},
{"id":0,"time":"Fri, 08 Dec 2017 04:55:57 GMT","title":"美国新墨西哥州校园枪击致３人死亡 - 新华网","category":"国际/港台","link":"http://news.xinhuanet.com/2017-12/08/c_1122080183.htm","description":"新华社休斯敦１２月７日电（记者高路刘立伟）美国南部新墨西哥州一所高中７日发生枪击事件，造成包括枪手在内的３人死亡。 发生枪击的高中位于新墨西哥州阿兹台克市，距离该州首府阿尔伯克基约２９０公里。当地警方证实，枪击发 ...","img":"t0.gstatic.com/images?q\u003dtbn:ANd9GcTNsWHOHPVu1GP044dDbnLwEMkl1_STcb5jwIxRzsGxVVByXq240snaoR0mfoxALj_ALay6oWaI"},
{"id":0,"time":"Fri, 08 Dec 2017 07:26:15 GMT","title":"太平洋战争爆发76周年美国珍珠港举行悼念仪式 - 新浪网","category":"国际/港台","link":"http://news.sina.com.cn/w/2017-12-08/doc-ifypnyqi2040702.shtml","description":"... 【环球网报道 实习记者 屈腾飞】据日本《朝日新闻》12月8日报道，当地时间12月7日早上，美国夏威夷珍珠港举行追悼会，悼念在76年前“珍珠港事件”中牺牲的美军官兵，在袭击中幸存下来的20余名美国老兵也参加了仪式。 追 ...","img":"t2.gstatic.com/images?q\u003dtbn:ANd9GcSJVngWkUoqu7je1oQuH720SshcP4cTO8dhEDwgW-FK4EWNCRyU-tVDz3jnW2gjf5scS0XdoNfn"},
{"id":0,"time":"Fri, 08 Dec 2017 05:31:32 GMT","title":"一周内第三位！一共和党众议员因性骚扰丑闻辞职 - 华夏经纬","category":"国际/港台","link":"http://huaxia.com/xw/gjxw/2017/12/5566514.html","description":"中新网12月8日电据外媒报道，美国众议院道德委员会披露它开始针对可能的性骚扰行为进行调查之后，亚利桑纳州的共和党籍众议员弗兰克斯宣布辞职。 弗兰克斯在7日晚上公布的声明中和承认他让他的工作人员感觉“不舒服 ...","img":"t0.gstatic.com/images?q\u003dtbn:ANd9GcR_Sf3uVa9eQq9b8rsvrgCTAcbOWjaLGAGxkOrpL0ge51w3o3aKnFx0q7rU0dkGewO2eR76YVuI"},
{"id":0,"time":"Fri, 08 Dec 2017 07:26:15 GMT","title":"快撤！！！末日山火失控！加州告急！ - 新浪网","category":"国际/港台","link":"http://news.sina.com.cn/o/2017-12-08/doc-ifypnyqi2038881.shtml","description":"当地时间12月5日，加州位于洛杉矶西北部的文图拉县（Ventura County）再次突发山火！ 更加不幸的是，受强风影响，火势迅速蔓延，狂烧45,000英亩，已经快烧到了洛杉矶市区了。 超过150栋建筑物被烧成废墟。 超过26万人停电 ...","img":"t1.gstatic.com/images?q\u003dtbn:ANd9GcThffK6Mid43XKbE6Wa0YH_PNz78bkngdYZhGkrlW5agYS8EyThJwnzKFrgt3gCN3TD_6mpjFcj"},
{"id":0,"time":"Fri, 08 Dec 2017 07:29:34 GMT","title":"欧盟与英国达成脱欧协议为贸易谈判铺平道路 - 新浪网","category":"国际/港台","link":"http://finance.sina.com.cn/7x24/2017-12-08/doc-ifypnqvn1490824.shtml","description":"新浪美股讯北京时间8日下午综合消息据外媒报道，欧盟与英国达成脱欧协议，为贸易谈判铺平道路。后续讨论将指明企业最关切的脱欧后的前途和方向。 CNN消息称，英国首相特蕾莎-梅8日与欧盟委员会主席容克会面。经过一周 ...","img":"t2.gstatic.com/images?q\u003dtbn:ANd9GcRKtFRIrZSajOn9Y8798yHdXYDSdpajSyCAZa6O4QAzDkCOlRj2KnuzcOX8Ez0q_8H8RcMybe5a"}
]
```

