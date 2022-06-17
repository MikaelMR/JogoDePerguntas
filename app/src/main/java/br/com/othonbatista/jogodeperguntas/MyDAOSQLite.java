//package br.com.othonbatista.jogodeperguntas;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//
//public class MyDAOSQLite {
//    public static long inserirQuestao(Context context, Questoes questoes) {
//        BancoDeDadosSQLite bancoDeDadosSQLite = new BancoDeDadosSQLite(context);
//        SQLiteDatabase sqLiteDatabase = bancoDeDadosSQLite.getWritableDatabase();
//
//        // Este objeto é responsável por enviar os dados para o banco de dados
//        ContentValues values = new ContentValues();
//        values.put("pergunta", questoes.getPergunta());
//        values.put("resposta", questoes.getResposta());
//
//        // Chamamos pelo método responsável por inserir no banco de dados
//        // O primeiro parâmetro refere-se a tabela
//        // O segundo parâmetro é nulo, pois estamos informando os dados através do objeto ContentValues
//        // O terceiro parâmetro refere-se aos dados que serão adicionados
//        return sqLiteDatabase.insert(
//                "questoes",
//                null,
//                values);
//    }
//    public static Cursor pesquisarTodasQuestoes(Context context) {
//        BancoDeDadosSQLite bancoDeDadosSQLite = new BancoDeDadosSQLite(context);
//        SQLiteDatabase sqLiteDatabase = bancoDeDadosSQLite. getReadableDatabase();
//        return sqLiteDatabase.query("questoes",null,null,null,null,null,null);
//    }
//}
