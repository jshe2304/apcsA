package Chapter11;

class DrawShape implements shapeA, shapeB, shapeC {
    public void Draw1() {
        System.out.println("Drawing Circle here:" + shapeA.baseclass);
    }

    public void Draw2() {
        System.out.println("Drawing Square here:" + shapeB.baseclass);
    }
    public void Draw3() {
        System.out.println("Drawing Triangle here:" + shapeC.baseclass);
    }
}