package external;

import common.Position;

public class standaardAlgoritme implements selectieAlgoritme {

    private standaardAlgoritme() {
    }

    @Override
    public float geefAfstand(Position p1, Position p2) {
        return berekenAfstand(p1, p2);
    }

    public static float berekenAfstand(Position p1, Position p2) {

        double ac = Math.abs(p2.getLatitude() - p1.getLatitude());
        double cb = Math.abs(p2.getLongtitude() - p1.getLongtitude());

        return (float) Math.hypot(ac, cb);
    }
}
