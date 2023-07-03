class Point:

    def __init__(self, Xcoor, Ycoor):
        self.Xcoor = Xcoor
        self.Ycoor = Ycoor
        self.slope = 0
        self.intercept = 0
    
    def getX(self):
        return self.Xcoor

    def getY(self):
        return self.Ycoor

    def reflect_x(self):
        Ynew = self.Ycoor * -1
        return Point(self.Xcoor, Ynew)
       

    def get_line_to(self, endPoint):
        self.slope =(self.Ycoor - endPoint.Ycoor)/(self.Xcoor - endPoint.Xcoor)
        self.intercept = self.Ycoor - self.slope*self.Xcoor

    def getSlope(self):
        return self.slope

    def getYIntercept(self):
        return self.intercept
    


def main():
    first = Point(3, -5)
    second = first.reflect_x()
    print("First (" + str(first.getX()) + "," + str(first.getY()) + ") Second (" + str(second.getX()) + "," + str(second.getY()) + ")")
    first.get_line_to(Point(-7,10))
    print("y=" + str(first.getSlope()) + "x+" + str(first.getYIntercept()))

main()
