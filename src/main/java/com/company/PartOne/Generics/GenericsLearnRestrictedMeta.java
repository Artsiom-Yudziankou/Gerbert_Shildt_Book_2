package com.company.PartOne.Generics;

// <? extends superClass> - to get top restriction of type
// <? super inheritedClass> - to get bottom restriction of type

public class GenericsLearnRestrictedMeta {
    static void showXYCoordinates (CoordinateData<?> coordinates) {
        System.out.println("Coordinates X Y: ");
        for (int i = 0; i < coordinates.arrayOfCoordinates.length; i++) {
            System.out.println(coordinates.arrayOfCoordinates[i].xCoordinate + " "
                    + coordinates.arrayOfCoordinates[i].yCoordinate);
        }
    }

    static void showXYZCoordinates (CoordinateData<? extends ThreeDimension> coordinates) {
        System.out.println("Coordinates X Y Z: ");
        for (int i = 0; i < coordinates.arrayOfCoordinates.length; i++) {
            System.out.println(coordinates.arrayOfCoordinates[i].xCoordinate + " "
                    + coordinates.arrayOfCoordinates[i].yCoordinate + " "
            + coordinates.arrayOfCoordinates[i].zCoordinate);
        }
    }

    static void showXYZUCoordinates (CoordinateData<? extends FourDimension> coordinate) {
        System.out.println("Coordinate X Y Z U: ");
        for (int i = 0; i < coordinate.arrayOfCoordinates.length; i++) {
            System.out.println(coordinate.arrayOfCoordinates[i].xCoordinate + " "
             + coordinate.arrayOfCoordinates[i].yCoordinate + " "
             + coordinate.arrayOfCoordinates[i].zCoordinate + " "
             + coordinate.arrayOfCoordinates[i].uCoordinate + " ");
        }
    }

    public static void main(String[] args) {
        TwoDimension twoDimension[] = {
                new TwoDimension(0, 0),
                new TwoDimension(7,9),
                new TwoDimension(18, 4),
                new TwoDimension(-1, -23)
        };

        CoordinateData<TwoDimension> twoDimensionCoordinateData = new CoordinateData<TwoDimension>(twoDimension);

        System.out.println("Coordinates of TwoDimension array: ");
        showXYCoordinates(twoDimensionCoordinateData);

        FourDimension fourDimension[] = {
                new FourDimension(1,2,3,4),
                new FourDimension(6,8,14,8),
                new FourDimension(22,9,4,9),
                new FourDimension(3,-2,-23,17)
        };

        CoordinateData<FourDimension> fourDimensionCoordinateData = new CoordinateData<FourDimension>(fourDimension);

        System.out.println("Coordinates of Four Dimension array: ");
        showXYCoordinates(fourDimensionCoordinateData);
        showXYZCoordinates(fourDimensionCoordinateData);
        showXYZUCoordinates(fourDimensionCoordinateData);
    }
}

class TwoDimension {
    int xCoordinate, yCoordinate;

    TwoDimension(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
    }
}

class ThreeDimension extends TwoDimension {
    int zCoordinate;

    ThreeDimension(int x, int y, int z) {
        super(x, y);
        zCoordinate = z;
    }
}

class FourDimension extends ThreeDimension{
    int uCoordinate;

    FourDimension(int x, int y, int z, int u) {
        super(x,y,z);
        uCoordinate = u;
    }
}

class CoordinateData <T extends TwoDimension>{
    T[] arrayOfCoordinates;

    CoordinateData(T[] arrayOfCoordinates) {
        this.arrayOfCoordinates = arrayOfCoordinates;
    }
}


