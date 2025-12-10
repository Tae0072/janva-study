package ex05;

class Pizza5장 {
    int radius;

    Pizza5장(int r) {
        radius = r;
    }
    Pizza5장 whosLargest(Pizza5장 p1, Pizza5장 p2){
        if (p1.radius > p2.radius) {
            return p1;
        }else {
            return p2;
        }
    }

    static void main() {

        Pizza5장 obj1=new Pizza5장(14);
        Pizza5장 obj2=new Pizza5장(18);

        Pizza5장 largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius+"인치 피자가 더 큼.");
    }
}
