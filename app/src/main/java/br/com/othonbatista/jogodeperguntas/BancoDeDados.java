package br.com.othonbatista.jogodeperguntas;


import android.content.Context;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

@Database(entities = {Questoes.class}, version = 1)
public abstract class BancoDeDados extends RoomDatabase {

    public abstract MyDAORoom getDAO();

    // Instância única para o banco de dados
    private static BancoDeDados instanciaBancoDeDados;

    // Padrão de Projeto Singleton
    public static BancoDeDados getBancoDeDadosInstancia(final Context context) {

        if (instanciaBancoDeDados == null) {

            synchronized (BancoDeDados.class) {

                // Cria a instância única para acessar o banco de dados

                instanciaBancoDeDados = Room.databaseBuilder(
                        context.getApplicationContext(),
                        BancoDeDados.class,
                        "questoes_database"
                )
                        .allowMainThreadQueries()
                        .build();

            }

        }

        return instanciaBancoDeDados;

    }

}
