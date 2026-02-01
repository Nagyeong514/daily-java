package Test.classStart;

public class MovieReviewMain {
    public static void main(String[] args) {
        /*//1.객체를 일단 만들고
        MovieReview num1 = new MovieReview();
        num1.title = "인셉션";
        num1.review = "인생은 무한 루프";

        MovieReview num2 = new MovieReview();
        num2.title = "어바웃 타임";
        num2.review = "인생 시간 영화!";

        System.out.println("영화 제목: \"" + num1.title + "\", 리뷰: \"" + num1.review + "\"");
        System.out.println("영화 제목: \"" + num2.title + "\", 리뷰: \"" + num2.review + "\"");
*/

        //2. 배열을 만들고
        String[] titles = new String[] {"인셉션", "어바웃 타임"};
        String[] reviews = new String[] {"인생은 무한 루프", "인생 시간 영화!"};

        for (int i = 0; i < titles.length ; i ++ ) {
            String t = titles[i];
            String r = reviews[i];
            System.out.println("영화 제목: \"" + t + "\", 리뷰: \"" + r + "\"");
        }





    }
}
