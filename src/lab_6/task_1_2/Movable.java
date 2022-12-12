package lab_6.task_1_2;

public class Movable {
    interface IMovable{
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }
    public static class MovablePoint implements IMovable {
        protected int x;
        protected int y;
        protected int xSpeed;
        protected int ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed){
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    ", xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }

        @Override
        public void moveUp() {
            System.out.println("Move Up!");
            y += ySpeed;
        }

        @Override
        public void moveDown() {
            System.out.println("Move Down!");
            y -= ySpeed;
        }

        @Override
        public void moveLeft() {
            System.out.println("Move Left!");
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            System.out.println("Move Right!");
            x += xSpeed;
        }
    }
    public static class MovableCircle  implements IMovable{
        private int radius;
        MovablePoint center;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
            center = new MovablePoint(x,y,xSpeed,ySpeed);
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "MovableCircle{" +
                    "radius=" + radius +
                    ", center=" + center +
                    '}';
        }

        @Override
        public void moveDown()  {
            System.out.print("Circle move down!");
            center.y -= center.ySpeed;
        }

        @Override
        public void moveLeft() {
            System.out.print("Circle move left!");
            center.x -= center.xSpeed;
        }

        @Override
        public void moveUp() {
            System.out.print("Circle move up!");
            center.y += center.ySpeed;
        }

        @Override
        public void moveRight() {
            System.out.print("Circle move right!");
            center.x += center.xSpeed;
        }
    }
    public static class MovableRectangle implements IMovable{
        private MovablePoint topLeft;
        private MovablePoint bottomRight;

        public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
            topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
            bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
        }

        @Override
        public String toString() {
            return "MovableRectangle{" +
                    "topLeft=" + topLeft +
                    ", bottomRight=" + bottomRight +
                    '}';
        }

        @Override
        public void moveDown() {
            System.out.println("Rectangle move down!");
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }

        @Override
        public void moveRight() {
            System.out.println("Rectangle move right!");
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }

        @Override
        public void moveUp() {
            System.out.println("Rectangle move up!");
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }

        @Override
        public void moveLeft() {
            System.out.println("Rectangle move left!");
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }

        public boolean sameSpeed(){
            return ((topLeft.xSpeed == bottomRight.xSpeed) & (topLeft.ySpeed == bottomRight.ySpeed));
        }
    }

    public static void main(String[] args) {
        IMovable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        IMovable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);

        IMovable m3 = new MovableRectangle(2, 3, 1,5, 4, 9);
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
        m3.moveRight();
        System.out.println(m3);
    }

}
