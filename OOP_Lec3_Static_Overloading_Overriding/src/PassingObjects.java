// passing objects as a parameter

class PassingObjects {
    int a, b;

    PassingObjects(int i, int  j) {
        a = i;
        b = j;
    }
    //return true if 0 is equal to the invoking object
    boolean equalTo(PassingObjects obj) {
        if(obj.a == a && obj.b == b)
            return true;
        else
            return false;
    }
}
