package com.tekwill.learning.io;

public class TableFromPrintf {
    public static void main(String[] args) {
        int num1 = 2020, num2 = 2019, num3 = 2018;
        int num4 = 4, num5 = 3, num6 = 2, num7 = 1;
        int num8 = 12;
        double num9 = 335.077, num10 = 156.374, num11 = 76.053, num12 = 9.253, num13 = 93.399, num14 = 324.444, num15 = 111.915;
        double num16 = 96.541, num17 = 15.178, num18 = 100.810, num19 = 84.3, num20 = 1.9, num21 = 3.5122, num22 = 86.4;
        double num23 = 0.5, num24 = 851.7, num25 = 91.5, num26 = 117.9, num27 = 85.0, num28 = 1.6, num29 = 2.6463;
        double num30 = 404.008, num31 = 159.946, num32 = 115.400, num33 = 17.150, num34 = 111.512, num35 = 388.873, num36 = 157.645;
        double num37 = 111.695, num38 = 12.371, num39 = 107.162, num40 = 81.7, num41 = 3.0, num42 = 7.7811, num43 = 96.7;
        double num44 = 0.3, num45 = 566.4, num46 = 96.7, num47 = 0.2, num48 = 49.2, num49 = 95.3, num50 = 0.5, num51 = 874.1;


        String str1 = "        ----------------Seasonally Adjusted----------------        |";
        String str2 = "        --------------NOT Seasonally Adjusted--------------        |";
        String str3 = "                 Performance Measures                                          |";

        String str4 = "Quater/12 Month End";

        String str5 = "Total Tax Revenue ", str6 = "Property", str7 = "income", str8 = " Sales";

        String str9 = "(value)", str10 = "(tqrr)", str11 = "(cv)", str12 = "(m/e)";

        String str13 = "st", str14 = "nd", str15 = "rd", str16 = "th";

        String str17 = "Quater", str18 = "(R)", str19 = "Mo.";

        String str20 = "End Jun", str21 = "End Mar", str22 = "End Dec", str23 = "End Sep";


        System.out.println("-----------------------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------");
        System.out.printf("|                   |%-70s%-70s            %-70s\n", str1, str2, str3);
        System.out.println("|                   |-------------------------------------------------------------------|--" +
                "-------------------------------------------------------------------|-------------------------------" +
                "--------------------------------------------------------------|");
        System.out.printf("|%s| %-10s| %-10s| %-20s  |%-11s|" +
                " %-11s| %-11s| %-20s  |%-12s|" +
                " %-20s| %-44s  |%-23s|\n", str4, str5, str6, str7, str8, str5, str6, str7, str8, str6, str7, str8);
        System.out.println("|                   |-------------------|-----------|-----------------------|-----------|--" +
                "-----------------|------------|-----------------------|------------|----------------" +
                "-----------------------------------------------------------------------------|");
        System.out.printf("|                   |%-19s|%-11s|%-11s|%-11s|%-11s|" +
                "%-19s|%-12s|%-11s|%-11s|%-12s|" +
                "%s| %s | %s | %s | %s | %s |" +
                " %s | %s | %s |" +
                " %s | %s | %s |\n", str9, str9, str9, str9, str9, str9, str9, str9, str9, str9, str10, str11, str12, str10, str11, str12, str10, str11, str12, str10, str11, str12);
        System.out.println("|-------------------|-------------------|-----------|-----------|-----------|-----------|--" +
                "-----------------|------------|-----------|-----------|------------|------|------|--" +
                "-----|--------|------|-------|--------|------|-------|--------|------|-------|");
        System.out.printf("|%d %d%s %s    |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num1, num6, str14, str17, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.4f|" +
                "\n", num19, num20, num21, num22, num23, num24, num25, num23, num26, num27, num28, num29);
        System.out.printf("|%d %d%s %s%s |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num1, num7, str13, str17, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);
        System.out.println("|                   |                   |           |           |           |           |  " +
                "                 |            |           |           |            |      |      |  " +
                "     |        |      |       |        |      |       |        |      |       |");

        System.out.printf("|%d %d%s %s%s |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num2, num4, str16, str17, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//2019 4th Quater(R)

        System.out.printf("|%d %d%s %s%s |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num2, num5, str15, str17, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//2019 3rd Quater(R)

        System.out.printf("|%d %d%s %s%s |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num2, num6, str14, str17, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//2019 2nd Quater(R)

        System.out.printf("|%d %d%s %s%s |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num2, num7, str13, str17, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//2019 2nd Quater(R)

        System.out.println("|                   |                   |           |           |           |           |  " +
                "                 |            |           |           |            |      |      |  " +
                "     |        |      |       |        |      |       |        |      |       |");

        System.out.printf("|%d %d%s %s%s |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num3, num4, str16, str17, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//2018 4th Quater(R)

        System.out.printf("|%d %d%s %s%s |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num3, num5, str15, str17, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//2018 3rd Quater(R)

        System.out.println("|                   |                   |           |           |           |           |  " +
                "                 |            |           |           |            |      |      |  " +
                "     |        |      |       |        |      |       |        |      |       |");

        System.out.printf("|%d%s%s%d   |%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num8, str19, str20, num1, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//12Mo.End Jun2020

        System.out.printf("|%d%s%s%d%s|%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num8, str19, str21, num1, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//12Mo.End Mar2020(R)

        System.out.println("|                   |                   |           |           |           |           |  " +
                "                 |            |           |           |            |      |      |  " +
                "     |        |      |       |        |      |       |        |      |       |");

        System.out.printf("|%d%s%s%d%s|%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num8, str19, str22, num2, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//12Mo.End Dec2019(R)

        System.out.printf("|%d%s%s%d%s|%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num8, str19, str23, num2, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//12Mo.End Sep2019(R)

        System.out.printf("|%d%s%s%d%s|%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num8, str19, str20, num2, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//12Mo.End Jun2019(R)

        System.out.printf("|%d%s%s%d%s|%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num8, str19, str21, num2, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//12Mo.End Mar2019(R)

        System.out.println("|                   |                   |           |           |           |           |  " +
                "                 |            |           |           |            |      |      |  " +
                "     |        |      |       |        |      |       |        |      |       |");

        System.out.printf("|%d%s%s%d%s|%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num8, str19, str22, num3, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//12Mo.End Dec2018(R)

        System.out.printf("|%d%s%s%d%s|%19.3f|%11.3f|%11.3f|%11.3f|%11.3f|" +
                "%19.3f|%12.3f|%11.3f|%11.3f|%12.3f|", num8, str19, str23, num3, str18, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39);
        System.out.printf("%6.1f|%6.1f|%7.4f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|%8.1f|%6.1f|%7.1f|" +
                "\n", num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51);//12Mo.End Sep2018(R)

        System.out.println("-----------------------------------------------------------------------------------------" +
                "---------------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------");

    }
}
