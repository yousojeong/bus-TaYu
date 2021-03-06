/*
package org.devTayu.busTayu.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.devTayu.busTayu.R;
import org.devTayu.busTayu.adapter.SearchAdapter;
import org.devTayu.busTayu.model.Search;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private RecyclerView mPostRecyclerView;
    private SearchAdapter mAdpater;
    private List<Search> mDatas;  //데이터를 넣은 리스트 변수

    DatabaseReference database;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_search);

        SearchView searchView;
        searchView = findViewById(R.id.searchView_search);

        mPostRecyclerView = findViewById(R.id.recyclerView_search);
        mPostRecyclerView.setHasFixedSize(true); // 리사이클러뷰 기존 성능 강화

        mDatas = new ArrayList<>(); // 객체 담을 arrayList
        // mDatas.add(new Search("샘플","데이터","xcode","ycode"));

        // Adapter, LayoutManager 연결
        mAdpater = new SearchAdapter(mDatas);
        mPostRecyclerView.setAdapter(mAdpater);
        mPostRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 일단 한번 전체 리스트 불러오기
        database = FirebaseDatabase.getInstance().getReference("DATA");
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // 파이어베이스 데이터베이스의 데이터를 받아옴
                mDatas.clear(); // 기존 배열리스트가 존재하지 않게 초기화
                // 반복문으로 데이터 List를 추출
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    // 만들어 뒀던 객체에 데이터를 담는다
                    Search search = dataSnapshot.getValue(Search.class);
                    // 담은 데이터들을 배열리스트에 넣고 리사이클러 뷰로 보낼 준비
                    mDatas.add(search);
                }
                // 리스트 저장 및 새로고침해야 반영이 됨
                mAdpater.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // 디비를 가져오던중 에러 발생 시 / 로그에 에러 찍힘
                Log.d("유소정", "SearchActivity : " + String.valueOf(error.toException()));
            }
        });

        // searchView setOnQueryTextListener
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //검색 할 내용을 작성하고 누르면 호출되는 부분
                //   TextView textView = (TextView) getView().findViewById(R.id.search_stationName);
                //   textView.setText(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.e("intent", "onQueryTextChange : " + newText);
                Search_Data(newText);
                return true;
            }
        });

    }

    public void Search_Data(String searchText) {
        database = FirebaseDatabase.getInstance().getReference("DATA");
        database.orderByChild("stop_nm").startAt(searchText).endAt(searchText + "\uf8ff").addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // 파이어베이스 데이터베이스의 데이터를 받아옴
                mDatas.clear(); // 기존 배열리스트가 존재하지 않게 초기화

                // 반복문으로 데이터 List를 추출
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    // 만들어 뒀던 객체에 데이터를 담는다
                    Search search = dataSnapshot.getValue(Search.class);
                    // 담은 데이터들을 배열리스트에 넣고 리사이클러 뷰로 보낼 준비
                    mDatas.add(search);
                }
                Log.e("이은지", "검색 결과 데이터 수 : " + String.valueOf(mDatas.size()));

                // 리스트 저장 및 새로고침해야 반영이 됨
                mAdpater.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // 디비를 가져오던중 에러 발생 시 / 로그에 에러 찍힘
                Log.d("유소정", "SearchActivity 디비 에러 : " + String.valueOf(error.toException()));
            }
        });

*/

/*

        mAdpater = new SearchAdapter(mDatas);
        mPostRecyclerView.setAdapter(mAdpater); // 리사이클러뷰에 어댑터 연결
    }
}
*/
