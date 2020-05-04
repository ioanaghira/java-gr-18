
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class JDBC_Main {
    private static final Logger logger = LogManager.getLogger(JDBC_Main.class);

    public static void main(String[] args) {

        //load driver

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = newConnection(
                "postgresql",
                "localhost",
                "5432",
                // Default database => postgres
                "booking",
                "postgres",
                "postgres"
        );

        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try {
//        createTableAccommodation(connection);
//        createTableRoomFair(connection);
//        createTableAccommodationToRoomFairRelation(connection);
//        insertAccommodationEntry(connection);
//        insertRoomFairEntry(connection);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }



        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" SELECT accommodation_to_room_fair_relation.id, accommodation.type, accommodation.description, accommodation.max_guests, room_fair.value, room_fair.season FROM accommodation Join accommodation_to_room_fair_relation ON accommodation_to_room_fair_relation.id_accommodation = accommodation.id Join room_fair ON accommodation_to_room_fair_relation.id_room_fair = room_fair.id");

            List<AccommodationPrice> catalogue = new ArrayList<>();
            while (resultSet.next()) {

                AccommodationPrice accommodationPrice = new AccommodationPrice();
                accommodationPrice.setId(resultSet.getInt("id"));
                accommodationPrice.setType(resultSet.getString("type"));
                accommodationPrice.setDescription(resultSet.getString("description"));
                accommodationPrice.setMax_guests(resultSet.getInt("max_guests"));
                accommodationPrice.setSeason(resultSet.getString("season"));
                accommodationPrice.setValue(resultSet.getDouble("value"));

                catalogue.add(accommodationPrice);
            }

            for (int i = 0; i < catalogue.size(); i++) {
                logger.info(catalogue.get(i));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


//
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from accommodation");
//
//            List<Accommodation> accommodations = new ArrayList<>();
//            while (resultSet.next()) {
//                Accommodation accommodation = new Accommodation();
//                accommodation.setId(resultSet.getInt("id"));
//                accommodation.setType(resultSet.getString("type"));
//                accommodation.setBed_type(resultSet.getString("bed_type"));
//                accommodation.setMax_guests(resultSet.getInt("max_guests"));
//                accommodation.setDescription(resultSet.getString("description"));
//
//                accommodations.add(accommodation);
//            }
//            accommodations.forEach(System.out::println);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//        Statement statement2 = connection.createStatement();
//        ResultSet resultSet2 = statement2.executeQuery("select * from room_fair");
//
//        List<RoomFair> roomFairs = new ArrayList<>();
//        while (resultSet2.next()) {
//            RoomFair roomFair = new RoomFair();
//            roomFair.setId(resultSet2.getInt("id"));
//            roomFair.setValue(resultSet2.getDouble("value"));
//            roomFair.setSeason(resultSet2.getString("season"));
//
//
//            roomFairs.add(roomFair);
//        }
//            roomFairs.forEach(System.out::println);
//        } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        try {
//            insertRoomRelation(connection);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    private static void insertRoomRelation(Connection connection) throws SQLException {
        PreparedStatement insertRoomRelation = connection.prepareStatement("insert into accommodation_to_room_fair_relation" +
                "(id_accommodation, id_room_fair) values (4,8)");

        insertRoomRelation.execute();
        connection.commit();

    }


    private static void insertRoomFairEntry(Connection connection) throws SQLException {
        PreparedStatement insertRoomFair = connection.prepareStatement("insert into room_fair" +
                //          "(value, season) values (100.0,'extra_season')" );
                //     "(value, season) values (160.0,'extra_season')");
                //    "(value, season) values (250.0,'extra_season')");
                //      "(value, season) values (310.0,'extra_season')");
                //     "(value, season) values (150.0,'season')");
                //    "(value, season) values (200.0,'season')");
                //   "(value, season) values (300.0,'season')");
                "(value, season) values (370.0,'season')");
        insertRoomFair.execute();
        connection.commit();

    }

    private static void createTableRoomFair(Connection connection) throws SQLException {

        PreparedStatement createTable = connection.prepareStatement(
                "create table room_fair " +
                        "(" +
                        "id SERIAL not null," +
                        "value decimal, " +
                        "season varchar(32), " +
                        "primary key(id))");


        createTable.execute();
        connection.commit();
    }


    private static void createTableAccommodationToRoomFairRelation(Connection connection) throws SQLException {
        PreparedStatement createTable = connection.prepareStatement(
                " create table accommodation_to_room_fair_relation " +
                        "(" +
                        "id SERIAL not null," +
                        "id_accommodation int, " +
                        "id_room_fair int, " +
                        "primary key(id)," +
                        "foreign key(id_accommodation) references accommodation(id) ," +
                        "foreign key(id_room_fair) references room_fair(id))"
        );
        createTable.execute();
        connection.commit();


    }

    private static void insertAccommodationEntry(Connection connection) throws SQLException {
        PreparedStatement insertAccommodation = connection.prepareStatement(
                "insert into accommodation" +
                        //    "(type, bed_type, max_guests, description) values ('standard','single',1,'garden view')");
                        //    "(type, bed_type, max_guests, description) values ('standard','double',2,'garden view')");
                        //    "(type, bed_type, max_guests, description) values ('superior','single',1,'ocean view')");
                        "(type, bed_type, max_guests, description) values ('superior','double',2,'ocean view'))");


        insertAccommodation.execute();
        connection.commit();

    }

    private static void createTableAccommodation(Connection connection) throws SQLException {
        PreparedStatement createTable = connection.prepareStatement(
                "create table accommodation " +
                        "(" +
                        "id SERIAL not null," +
                        "type varchar(32), " +
                        "bed_type varchar(32), " +
                        "max_guests int, " +
                        "description varchar(512), " +
                        "primary key(id))");

        createTable.execute();
        connection.commit();
    }


    private static Connection newConnection(String type, String host, String port,
                                            String dbName, String user,
                                            String password) {
        //  jdbc:postgresql://localhost:5432/booking

        String url = "jdbc:" + type + "://" + host + ":" + port + "/" + dbName +
                "?user=" + user + "&password=" + password;
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
