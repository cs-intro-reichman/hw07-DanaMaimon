public class IsSorted {

    // Public function: called by the user
    public static boolean isSorted(int[] a) {
        return isSorted(a, 0);
    }

    // Helper recursive function
    private static boolean isSorted(int[] a, int i) {
        // Helper recursive function
        // 1. תנאי עצירה: הגענו לסוף המערך (או שהמערך ריק), הכל תקין
        if (i >= a.length - 1) {
            return true;
        }

        // 2. בדיקה: אם האיבר הנוכחי גדול מהבא אחריו - הסדר שגוי
        if (a[i] > a[i + 1]) {
            return false;
        }

        // 3. צעד רקורסיבי: בדוק את הזוג הבא
        return isSorted(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5};
        System.out.println(isSorted(a)); // true

        int[] b = {1, 3, 2};
        System.out.println(isSorted(b)); // false
    }
}
