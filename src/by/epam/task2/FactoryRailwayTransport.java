package by.epam.task2;

import by.epam.task2.carriage.PassengerCarriage;
import by.epam.task2.locomotive.Locomotive;

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
