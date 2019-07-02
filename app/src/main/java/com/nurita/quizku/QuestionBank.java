package com.nurita.quizku;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Hasil dari -4 + 8 : (-2) x 2 + 5 -2 adalah...",
            "2. Sebuah toko kue selama 8 hari dapat membuat 240 kotak kue. Banyak kue yang dapat dibuat oleh toko tersebut selama 12 hari adalah...",
            "3. Diketahui barisan aritmetika dengan U4= 20 dan U8= 44. Suku ke-40 baris itu adalah...",
            "4. Pak Arif membeli motor dengan harga Rp15.000.000,00 dan dijual lagi dengan harga Rp16.500.000,00. Berapa perentase keuntungan yang diperoleh...",
            "5. K = {3, 4, 5} dan L = {1, 2, 3, 4, 5, 6, 7}, himpunan pasangan berurutan yang menyatakan relasi “dua lebihnya dari” dari himpunan K ke L adalah..."
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"-9", "-7", "7", "9"},
            {"160 kotak", "260 kotak", "360 kotak", "460 kotak"},
            {"106", "236", "246", "275"},
            {"1%", "1,5%", "10%", "15%"},
            {"{(3, 5), (4, 6)}", "{(3, 5), (4, 6), (5, 7)}", "{(3, 1), (4, 2), (5, 3)}", "{(3, 2), (4, 2), (5, 2)}"}
    };

    private String mCorrectAnswers[] = {"-9", "360 kotak", "236", "10%", "{(3, 1), (4, 2), (5, 3)}"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
