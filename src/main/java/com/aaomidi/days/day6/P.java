package com.aaomidi.days.day6;

import com.aaomidi.model.Problem;
import com.aaomidi.util.IntegerConverter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amir on 2015-12-06.
 */
public class P extends Problem {
    public static final String input = "turn on 489,959 through 759,964\n" +
            "turn off 820,516 through 871,914\n" +
            "turn off 427,423 through 929,502\n" +
            "turn on 774,14 through 977,877\n" +
            "turn on 410,146 through 864,337\n" +
            "turn on 931,331 through 939,812\n" +
            "turn off 756,53 through 923,339\n" +
            "turn off 313,787 through 545,979\n" +
            "turn off 12,823 through 102,934\n" +
            "toggle 756,965 through 812,992\n" +
            "turn off 743,684 through 789,958\n" +
            "toggle 120,314 through 745,489\n" +
            "toggle 692,845 through 866,994\n" +
            "turn off 587,176 through 850,273\n" +
            "turn off 674,321 through 793,388\n" +
            "toggle 749,672 through 973,965\n" +
            "turn on 943,30 through 990,907\n" +
            "turn on 296,50 through 729,664\n" +
            "turn on 212,957 through 490,987\n" +
            "toggle 171,31 through 688,88\n" +
            "turn off 991,989 through 994,998\n" +
            "turn off 913,943 through 958,953\n" +
            "turn off 278,258 through 367,386\n" +
            "toggle 275,796 through 493,971\n" +
            "turn off 70,873 through 798,923\n" +
            "toggle 258,985 through 663,998\n" +
            "turn on 601,259 through 831,486\n" +
            "turn off 914,94 through 941,102\n" +
            "turn off 558,161 through 994,647\n" +
            "turn on 119,662 through 760,838\n" +
            "toggle 378,775 through 526,852\n" +
            "turn off 384,670 through 674,972\n" +
            "turn off 249,41 through 270,936\n" +
            "turn on 614,742 through 769,780\n" +
            "turn on 427,70 through 575,441\n" +
            "turn on 410,478 through 985,753\n" +
            "turn off 619,46 through 931,342\n" +
            "turn on 284,55 through 768,922\n" +
            "turn off 40,592 through 728,685\n" +
            "turn on 825,291 through 956,950\n" +
            "turn on 147,843 through 592,909\n" +
            "turn off 218,675 through 972,911\n" +
            "toggle 249,291 through 350,960\n" +
            "turn off 556,80 through 967,675\n" +
            "toggle 609,148 through 968,279\n" +
            "toggle 217,605 through 961,862\n" +
            "toggle 407,177 through 548,910\n" +
            "toggle 400,936 through 599,938\n" +
            "turn off 721,101 through 925,455\n" +
            "turn on 268,631 through 735,814\n" +
            "toggle 549,969 through 612,991\n" +
            "toggle 553,268 through 689,432\n" +
            "turn off 817,668 through 889,897\n" +
            "toggle 801,544 through 858,556\n" +
            "toggle 615,729 through 832,951\n" +
            "turn off 427,477 through 958,948\n" +
            "turn on 164,49 through 852,946\n" +
            "turn on 542,449 through 774,776\n" +
            "turn off 923,196 through 980,446\n" +
            "toggle 90,310 through 718,846\n" +
            "turn off 657,215 through 744,252\n" +
            "turn off 800,239 through 811,712\n" +
            "turn on 502,90 through 619,760\n" +
            "toggle 649,512 through 862,844\n" +
            "turn off 334,903 through 823,935\n" +
            "turn off 630,233 through 839,445\n" +
            "turn on 713,67 through 839,865\n" +
            "turn on 932,50 through 982,411\n" +
            "turn off 480,729 through 984,910\n" +
            "turn on 100,219 through 796,395\n" +
            "turn on 758,108 through 850,950\n" +
            "turn off 427,276 through 439,938\n" +
            "turn on 178,284 through 670,536\n" +
            "toggle 540,27 through 625,102\n" +
            "turn off 906,722 through 936,948\n" +
            "toggle 345,418 through 859,627\n" +
            "toggle 175,775 through 580,781\n" +
            "toggle 863,28 through 929,735\n" +
            "turn off 824,858 through 905,973\n" +
            "toggle 752,312 through 863,425\n" +
            "turn on 985,716 through 988,852\n" +
            "turn off 68,504 through 763,745\n" +
            "toggle 76,209 through 810,720\n" +
            "turn off 657,607 through 676,664\n" +
            "toggle 596,869 through 896,921\n" +
            "turn off 915,411 through 968,945\n" +
            "turn off 368,39 through 902,986\n" +
            "turn on 11,549 through 393,597\n" +
            "turn off 842,893 through 976,911\n" +
            "toggle 274,106 through 581,329\n" +
            "toggle 406,403 through 780,950\n" +
            "toggle 408,988 through 500,994\n" +
            "toggle 217,73 through 826,951\n" +
            "turn on 917,872 through 961,911\n" +
            "toggle 394,34 through 510,572\n" +
            "toggle 424,603 through 583,626\n" +
            "toggle 106,159 through 755,738\n" +
            "turn off 244,610 through 472,709\n" +
            "turn on 350,265 through 884,690\n" +
            "turn on 688,184 through 928,280\n" +
            "toggle 279,443 through 720,797\n" +
            "turn off 615,493 through 888,610\n" +
            "toggle 118,413 through 736,632\n" +
            "turn on 798,782 through 829,813\n" +
            "turn off 250,934 through 442,972\n" +
            "turn on 68,503 through 400,949\n" +
            "toggle 297,482 through 313,871\n" +
            "toggle 710,3 through 839,859\n" +
            "turn on 125,300 through 546,888\n" +
            "toggle 482,39 through 584,159\n" +
            "turn off 536,89 through 765,962\n" +
            "turn on 530,518 through 843,676\n" +
            "turn on 994,467 through 994,676\n" +
            "turn on 623,628 through 744,927\n" +
            "toggle 704,912 through 837,983\n" +
            "turn on 154,364 through 517,412\n" +
            "toggle 344,409 through 780,524\n" +
            "turn off 578,740 through 725,879\n" +
            "turn on 251,933 through 632,957\n" +
            "turn on 827,705 through 971,789\n" +
            "toggle 191,282 through 470,929\n" +
            "toggle 324,525 through 446,867\n" +
            "toggle 534,343 through 874,971\n" +
            "toggle 550,650 through 633,980\n" +
            "toggle 837,404 through 881,915\n" +
            "toggle 338,881 through 845,905\n" +
            "turn on 469,462 through 750,696\n" +
            "turn on 741,703 through 892,870\n" +
            "turn off 570,215 through 733,562\n" +
            "turn on 445,576 through 870,775\n" +
            "turn on 466,747 through 554,878\n" +
            "turn off 820,453 through 868,712\n" +
            "turn off 892,706 through 938,792\n" +
            "turn off 300,238 through 894,746\n" +
            "turn off 306,44 through 457,444\n" +
            "turn off 912,569 through 967,963\n" +
            "toggle 109,756 through 297,867\n" +
            "turn on 37,546 through 41,951\n" +
            "turn on 321,637 through 790,910\n" +
            "toggle 66,50 through 579,301\n" +
            "toggle 933,221 through 933,791\n" +
            "turn on 486,676 through 878,797\n" +
            "turn on 417,231 through 556,317\n" +
            "toggle 904,468 through 981,873\n" +
            "turn on 417,675 through 749,712\n" +
            "turn on 692,371 through 821,842\n" +
            "toggle 324,73 through 830,543\n" +
            "turn on 912,490 through 977,757\n" +
            "turn off 634,872 through 902,949\n" +
            "toggle 266,779 through 870,798\n" +
            "turn on 772,982 through 990,996\n" +
            "turn off 607,46 through 798,559\n" +
            "turn on 295,602 through 963,987\n" +
            "turn on 657,86 through 944,742\n" +
            "turn off 334,639 through 456,821\n" +
            "turn off 997,667 through 997,670\n" +
            "turn off 725,832 through 951,945\n" +
            "turn off 30,120 through 952,984\n" +
            "turn on 860,965 through 917,976\n" +
            "toggle 471,997 through 840,998\n" +
            "turn off 319,307 through 928,504\n" +
            "toggle 823,631 through 940,908\n" +
            "toggle 969,984 through 981,993\n" +
            "turn off 691,319 through 865,954\n" +
            "toggle 911,926 through 938,929\n" +
            "turn on 953,937 through 968,991\n" +
            "toggle 914,643 through 975,840\n" +
            "turn on 266,982 through 436,996\n" +
            "turn off 101,896 through 321,932\n" +
            "turn off 193,852 through 751,885\n" +
            "turn off 576,532 through 863,684\n" +
            "turn on 761,456 through 940,783\n" +
            "turn on 20,290 through 398,933\n" +
            "turn off 435,335 through 644,652\n" +
            "turn on 830,569 through 905,770\n" +
            "turn off 630,517 through 905,654\n" +
            "turn on 664,53 through 886,976\n" +
            "toggle 275,416 through 408,719\n" +
            "turn on 370,621 through 515,793\n" +
            "turn on 483,373 through 654,749\n" +
            "turn on 656,786 through 847,928\n" +
            "turn off 532,752 through 945,974\n" +
            "toggle 301,150 through 880,792\n" +
            "turn off 951,488 through 958,952\n" +
            "turn on 207,729 through 882,828\n" +
            "toggle 694,532 through 973,961\n" +
            "toggle 676,639 through 891,802\n" +
            "turn off 653,6 through 905,519\n" +
            "toggle 391,109 through 418,312\n" +
            "turn on 877,423 through 957,932\n" +
            "turn on 340,145 through 563,522\n" +
            "turn off 978,467 through 988,895\n" +
            "turn off 396,418 through 420,885\n" +
            "turn off 31,308 through 816,316\n" +
            "turn on 107,675 through 758,824\n" +
            "turn on 61,82 through 789,876\n" +
            "turn on 750,743 through 754,760\n" +
            "toggle 88,733 through 736,968\n" +
            "turn off 754,349 through 849,897\n" +
            "toggle 157,50 through 975,781\n" +
            "turn off 230,231 through 865,842\n" +
            "turn off 516,317 through 630,329\n" +
            "turn off 697,820 through 829,903\n" +
            "turn on 218,250 through 271,732\n" +
            "toggle 56,167 through 404,431\n" +
            "toggle 626,891 through 680,927\n" +
            "toggle 370,207 through 791,514\n" +
            "toggle 860,74 through 949,888\n" +
            "turn on 416,527 through 616,541\n" +
            "turn off 745,449 through 786,908\n" +
            "turn on 485,554 through 689,689\n" +
            "turn on 586,62 through 693,141\n" +
            "toggle 506,759 through 768,829\n" +
            "turn on 473,109 through 929,166\n" +
            "turn on 760,617 through 773,789\n" +
            "toggle 595,683 through 618,789\n" +
            "turn off 210,775 through 825,972\n" +
            "toggle 12,426 through 179,982\n" +
            "turn on 774,539 through 778,786\n" +
            "turn on 102,498 through 121,807\n" +
            "turn off 706,897 through 834,965\n" +
            "turn off 678,529 through 824,627\n" +
            "turn on 7,765 through 615,870\n" +
            "turn off 730,872 through 974,943\n" +
            "turn off 595,626 through 836,711\n" +
            "turn off 215,424 through 841,959\n" +
            "toggle 341,780 through 861,813\n" +
            "toggle 507,503 through 568,822\n" +
            "turn on 252,603 through 349,655\n" +
            "toggle 93,521 through 154,834\n" +
            "turn on 565,682 through 951,954\n" +
            "turn on 544,318 through 703,418\n" +
            "toggle 756,953 through 891,964\n" +
            "turn on 531,123 through 856,991\n" +
            "turn on 148,315 through 776,559\n" +
            "turn off 925,835 through 963,971\n" +
            "turn on 895,944 through 967,964\n" +
            "turn off 102,527 through 650,747\n" +
            "toggle 626,105 through 738,720\n" +
            "turn off 160,75 through 384,922\n" +
            "toggle 813,724 through 903,941\n" +
            "turn on 207,107 through 982,849\n" +
            "toggle 750,505 through 961,697\n" +
            "toggle 105,410 through 885,819\n" +
            "turn on 226,104 through 298,283\n" +
            "turn off 224,604 through 508,762\n" +
            "turn on 477,368 through 523,506\n" +
            "turn off 477,901 through 627,936\n" +
            "turn off 887,131 through 889,670\n" +
            "turn on 896,994 through 938,999\n" +
            "toggle 401,580 through 493,728\n" +
            "toggle 987,184 through 991,205\n" +
            "turn on 821,643 through 882,674\n" +
            "toggle 784,940 through 968,959\n" +
            "turn off 251,293 through 274,632\n" +
            "turn off 339,840 through 341,844\n" +
            "turn off 675,351 through 675,836\n" +
            "toggle 918,857 through 944,886\n" +
            "toggle 70,253 through 918,736\n" +
            "turn off 612,604 through 772,680\n" +
            "turn off 277,40 through 828,348\n" +
            "toggle 692,139 through 698,880\n" +
            "toggle 124,446 through 883,453\n" +
            "toggle 969,932 through 990,945\n" +
            "toggle 855,692 through 993,693\n" +
            "toggle 722,472 through 887,899\n" +
            "toggle 978,149 through 985,442\n" +
            "toggle 837,540 through 916,889\n" +
            "turn off 612,2 through 835,82\n" +
            "toggle 560,767 through 878,856\n" +
            "turn on 461,734 through 524,991\n" +
            "toggle 206,824 through 976,912\n" +
            "turn on 826,610 through 879,892\n" +
            "turn on 577,699 through 956,933\n" +
            "turn off 9,250 through 50,529\n" +
            "turn off 77,657 through 817,677\n" +
            "turn on 68,419 through 86,426\n" +
            "turn on 991,720 through 992,784\n" +
            "turn on 668,20 through 935,470\n" +
            "turn off 133,418 through 613,458\n" +
            "turn off 487,286 through 540,328\n" +
            "toggle 247,874 through 840,955\n" +
            "toggle 301,808 through 754,970\n" +
            "turn off 34,194 through 578,203\n" +
            "turn off 451,49 through 492,921\n" +
            "turn on 907,256 through 912,737\n" +
            "turn off 479,305 through 702,587\n" +
            "turn on 545,583 through 732,749\n" +
            "toggle 11,16 through 725,868\n" +
            "turn on 965,343 through 986,908\n" +
            "turn on 674,953 through 820,965\n" +
            "toggle 398,147 through 504,583\n" +
            "turn off 778,194 through 898,298\n" +
            "turn on 179,140 through 350,852\n" +
            "turn off 241,118 through 530,832\n" +
            "turn off 41,447 through 932,737\n" +
            "turn off 820,663 through 832,982\n" +
            "turn on 550,460 through 964,782\n" +
            "turn on 31,760 through 655,892\n" +
            "toggle 628,958 through 811,992";
    private static final Pattern pattern = Pattern.compile(".*(turn (on|off)|toggle)\\s(\\d+),(\\d+)(\\s\\w+\\s)(\\d+),(\\d+).*");
    private static final List<Instruction> instructionList = new ArrayList<>();

    public P() {
        super("Day 6: Probably a Fire Hazard");
    }

    @Override
    public String solvePart1() {
        for (String s : input.split("\n")) {
            Matcher matcher = pattern.matcher(s);
            matcher.matches();
            String o = matcher.group(1);

            String s1 = matcher.group(3);
            String e1 = matcher.group(4);

            String s2 = matcher.group(6);
            String e2 = matcher.group(7);

            int start[] = new int[2];
            int end[] = new int[2];

            start[0] = IntegerConverter.fromString(s1);
            start[1] = IntegerConverter.fromString(s2);

            end[0] = IntegerConverter.fromString(e1);
            end[1] = IntegerConverter.fromString(e2);
            switch (o) {
                case "turn on":
                    instructionList.add(new Instruction(start, end, Instruction.Operation.TURN_ON));
                    break;
                case "turn off":
                    instructionList.add(new Instruction(start, end, Instruction.Operation.TURN_OFF));
                    break;
                case "toggle":
                    instructionList.add(new Instruction(start, end, Instruction.Operation.TOGGLE));
                    break;
            }
        }
        Lights lights = new Lights();
        for (Instruction instruction : instructionList) {
            lights.operate(instruction, true);
        }

        return lights.getOnLights() + "";
    }

    @Override
    public String solvePart2() {
        Lights lights = new Lights();
        for (Instruction i : instructionList) {
            lights.operate(i, false);
        }

        return lights.getAllBrightness() + "";

    }

    @RequiredArgsConstructor
    public static class Instruction {
        @Getter
        private final int start[];

        @Getter
        private final int end[];

        @Getter
        private final Operation operation;

        public enum Operation {
            TOGGLE,
            TURN_ON,
            TURN_OFF;
        }
    }

    public class Lights {
        private final Light lights[][] = new Light[1000][1000];

        public Lights() {
            int count = 0;
            for (int i = 0; i <= 999; i++) {
                for (int j = 0; j <= 999; j++) {
                    count++;
                    lights[i][j] = new Light();
                }
            }
        }

        public void operate(Instruction instruction, boolean isFirst) {
            switch (instruction.getOperation()) {
                case TURN_ON:
                    turnOn(instruction.getStart(), instruction.getEnd(), isFirst);
                    break;
                case TURN_OFF:
                    turnOff(instruction.getStart(), instruction.getEnd(), isFirst);
                    break;
                case TOGGLE:
                    toggle(instruction.getStart(), instruction.getEnd(), isFirst);
                    break;
            }
        }

        public void turnOn(int[] start, int end[], boolean isFirst) {
            for (int i = start[0]; i <= start[1]; i++) {
                for (int j = end[0]; j <= end[1]; j++) {
                    if (isFirst) {
                        lights[i][j].turnOn();
                    } else {
                        lights[i][j].increaseBrightness(1);
                    }
                }
            }
        }

        public void turnOff(int[] start, int end[], boolean isFirst) {
            for (int i = start[0]; i <= start[1]; i++) {
                for (int j = end[0]; j <= end[1]; j++) {
                    if (isFirst) {
                        lights[i][j].turnOff();
                    } else {
                        lights[i][j].decreaseBrightness(1);
                    }
                }
            }
        }

        public void toggle(int[] start, int end[], boolean isFirst) {
            for (int i = start[0]; i <= start[1]; i++) {
                for (int j = end[0]; j <= end[1]; j++) {
                    if (isFirst) {
                        lights[i][j].toggle();
                    } else {
                        lights[i][j].increaseBrightness(2);
                    }
                }
            }
        }

        public int getOnLights() {
            int count = 0;
            for (int i = 0; i <= 999; i++) {
                for (int j = 0; j <= 999; j++) {
                    if (lights[i][j].isOn()) count++;
                }
            }
            return count;
        }

        public int getAllBrightness() {
            int brightness = 0;
            for (int i = 0; i <= 999; i++) {
                for (int j = 0; j <= 999; j++) {
                    brightness += lights[i][j].brightness;
                }
            }
            return brightness;
        }
    }

    public class Light {
        private int brightness = 0;

        private void increaseBrightness(int amount) {
            brightness += amount;

        }

        private void decreaseBrightness(int amount) {
            if (brightness - 1 < 0) {
                brightness = 0;
                return;
            }
            brightness -= amount;
        }

        private void turnOn() {
            brightness = 1;
        }

        private void turnOff() {
            brightness = 0;
        }

        private void toggle() {
            if (isOn()) {
                brightness = 0;
                return;
            }
            brightness = 1;
        }

        private boolean isOn() {
            return brightness >= 1;
        }
    }
}
