package marc.com.news.util;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 14:44
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public class Util {
	public static enum CATEGORY {
		NEWS_HOT("热点","news_hot"),VIDEO("视频","video")
		,NEWS_SOCIETY("社会","news_society"),NEWS_ENTERTAINMENT("娱乐","news_entertainment")
		,QUESTION_AND_ANSWER("问答","question_and_answer"),组图("组图","组图")
		,NEWS_TECH("科技","news_tech"),NEWS_CAR("汽车","news_car"),NEWS_SPORT("体育","news_sport")
		,NEWS_FINANCE("财经","news_finance"),NEWS_MILITARY("军事","news_military")
		,NEWS_WORLD("国际","news_world"),ESSAY_JOKE("段子","essay_joke"),IMAGE_FUNNY("趣图","image_funny");


		private final String title;
		private final String key;

		CATEGORY(String title, String key) {
			this.title = title;
			this.key = key;
		}

		public String getTitle() {
			return title;
		}

		public String getKey() {
			return key;
		}
	}

	public static CATEGORY[] mCategeories = new CATEGORY[]{
			CATEGORY.NEWS_HOT,CATEGORY.VIDEO
			,CATEGORY.NEWS_SOCIETY,CATEGORY.NEWS_ENTERTAINMENT
			,CATEGORY.QUESTION_AND_ANSWER,CATEGORY.组图
			,CATEGORY.NEWS_TECH,CATEGORY.NEWS_CAR,CATEGORY.NEWS_SPORT
			,CATEGORY.NEWS_FINANCE,CATEGORY.NEWS_MILITARY
			,CATEGORY.NEWS_WORLD,CATEGORY.ESSAY_JOKE,CATEGORY.IMAGE_FUNNY
	};
}
