package com.appdev.jayes.claymodelsell;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class Transfer extends AppCompatActivity {
    private DatabaseReference mDatabase;
    ArrayList<SellModel> salesArray = new ArrayList<>();
    private FirebaseUser user;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*  setContentView(R.layout.activity_transfer);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        ;

        mDatabase = FirebaseDatabase.getInstance().getReference("users/" + "I5YujvSYM4gr6KgUWhI62L7aE543" + "/sales");
        Query q = mDatabase.child("2019").orderByChild("receiptNo").startAt("0001").endAt("5000");
        q.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot data : dataSnapshot.getChildren()) {
                        SellModel temp = data.getValue(SellModel.class);
                        salesArray.add(temp);
                    }

                    DatabaseReference refSale = FirebaseDatabase.getInstance().getReference(
                            "users/" +
                                    "kGWoStop7oUfSKxIde6nejZrTa33" +
                                    "/sales/2019/");
                    for (SellModel sales : salesArray) {
                        i = 1;
                        refSale.push().setValue(sales, new DatabaseReference.CompletionListener() {
                            @Override
                            public void onComplete(@Nullable DatabaseError databaseError, @NonNull DatabaseReference databaseReference) {
                                System.out.println(i);
                                i++;
                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
*/
    }
}