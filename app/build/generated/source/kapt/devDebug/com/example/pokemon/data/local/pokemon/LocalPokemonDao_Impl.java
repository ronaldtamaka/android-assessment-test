package com.example.pokemon.data.local.pokemon;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LocalPokemonDao_Impl implements LocalPokemonDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LocalPokemon> __insertionAdapterOfLocalPokemon;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllPokemon;

  public LocalPokemonDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocalPokemon = new EntityInsertionAdapter<LocalPokemon>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `pokemon` (`pokemon_id`,`pokemon_name`,`pokemon_image_url`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocalPokemon value) {
        stmt.bindLong(1, value.getId());
        if (value.getPokemonName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPokemonName());
        }
        if (value.getPokemonImageUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPokemonImageUrl());
        }
      }
    };
    this.__preparedStmtOfDeleteAllPokemon = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM pokemon";
        return _query;
      }
    };
  }

  @Override
  public void saveAllPokemon(final List<LocalPokemon> pokemonList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLocalPokemon.insert(pokemonList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void renewAllData(final List<LocalPokemon> pokemonList) {
    __db.beginTransaction();
    try {
      LocalPokemonDao.DefaultImpls.renewAllData(LocalPokemonDao_Impl.this, pokemonList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllPokemon() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllPokemon.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllPokemon.release(_stmt);
    }
  }

  @Override
  public DataSource.Factory<Integer, LocalPokemon> loadAllPokemonPaged() {
    final String _sql = "SELECT * FROM pokemon";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, LocalPokemon>() {
      @Override
      public LimitOffsetDataSource<LocalPokemon> create() {
        return new LimitOffsetDataSource<LocalPokemon>(__db, _statement, false, true , "pokemon") {
          @Override
          protected List<LocalPokemon> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "pokemon_id");
            final int _cursorIndexOfPokemonName = CursorUtil.getColumnIndexOrThrow(cursor, "pokemon_name");
            final int _cursorIndexOfPokemonImageUrl = CursorUtil.getColumnIndexOrThrow(cursor, "pokemon_image_url");
            final List<LocalPokemon> _res = new ArrayList<LocalPokemon>(cursor.getCount());
            while(cursor.moveToNext()) {
              final LocalPokemon _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final String _tmpPokemonName;
              if (cursor.isNull(_cursorIndexOfPokemonName)) {
                _tmpPokemonName = null;
              } else {
                _tmpPokemonName = cursor.getString(_cursorIndexOfPokemonName);
              }
              final String _tmpPokemonImageUrl;
              if (cursor.isNull(_cursorIndexOfPokemonImageUrl)) {
                _tmpPokemonImageUrl = null;
              } else {
                _tmpPokemonImageUrl = cursor.getString(_cursorIndexOfPokemonImageUrl);
              }
              _item = new LocalPokemon(_tmpId,_tmpPokemonName,_tmpPokemonImageUrl);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public List<LocalPokemon> loadAllPokemon() {
    final String _sql = "SELECT * FROM pokemon";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "pokemon_id");
      final int _cursorIndexOfPokemonName = CursorUtil.getColumnIndexOrThrow(_cursor, "pokemon_name");
      final int _cursorIndexOfPokemonImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "pokemon_image_url");
      final List<LocalPokemon> _result = new ArrayList<LocalPokemon>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LocalPokemon _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpPokemonName;
        if (_cursor.isNull(_cursorIndexOfPokemonName)) {
          _tmpPokemonName = null;
        } else {
          _tmpPokemonName = _cursor.getString(_cursorIndexOfPokemonName);
        }
        final String _tmpPokemonImageUrl;
        if (_cursor.isNull(_cursorIndexOfPokemonImageUrl)) {
          _tmpPokemonImageUrl = null;
        } else {
          _tmpPokemonImageUrl = _cursor.getString(_cursorIndexOfPokemonImageUrl);
        }
        _item = new LocalPokemon(_tmpId,_tmpPokemonName,_tmpPokemonImageUrl);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LocalPokemon loadPokemonById(final String name) {
    final String _sql = "SELECT * FROM pokemon WHERE pokemon_name=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "pokemon_id");
      final int _cursorIndexOfPokemonName = CursorUtil.getColumnIndexOrThrow(_cursor, "pokemon_name");
      final int _cursorIndexOfPokemonImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "pokemon_image_url");
      final LocalPokemon _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpPokemonName;
        if (_cursor.isNull(_cursorIndexOfPokemonName)) {
          _tmpPokemonName = null;
        } else {
          _tmpPokemonName = _cursor.getString(_cursorIndexOfPokemonName);
        }
        final String _tmpPokemonImageUrl;
        if (_cursor.isNull(_cursorIndexOfPokemonImageUrl)) {
          _tmpPokemonImageUrl = null;
        } else {
          _tmpPokemonImageUrl = _cursor.getString(_cursorIndexOfPokemonImageUrl);
        }
        _result = new LocalPokemon(_tmpId,_tmpPokemonName,_tmpPokemonImageUrl);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
