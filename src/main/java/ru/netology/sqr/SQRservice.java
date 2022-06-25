package ru.netology.sqr;
public class SQRservice {
    public int calculate (int x, int y){
        int count = 0;
        for (int z = 10; z <= 99;
             z++) {
            if (z * z >= x)
                if (z * z <= y)
                    count++;

        }
        return count;
    }
}
