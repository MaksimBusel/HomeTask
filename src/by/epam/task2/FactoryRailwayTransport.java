package by.epam.task2;

public class FactoryRailwayTransport {

    public static RailwayTransport createRailwayTransport(String typeTransport){
          switch (typeTransport){
              case "carriage":{
                  return new PassengerCarriage();
              }
              case "locomotive":{
                  return new Locomotive();
              }
              default: throw new RuntimeException();
          }
    }
}
