package com.wingled22.androidcrud;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

//Extends to this
public class FruitAddFragment extends AppCompatDialogFragment {
private EditText txtName;
private CategoryAddListener listener;


@NonNull
@Override
public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//create builder obj
AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

//create layoutinflater
LayoutInflater inflater = getActivity().getLayoutInflater();

//create view + inflate with inflater
View view = inflater.inflate(R.layout.fruit_add_popup, null);

//set view to builder add title, negative and positive button action
builder.setView(view)
.setTitle("Add Fruit")
.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
@Override
public void onClick(DialogInterface dialogInterface, int i) {

}
})
.setPositiveButton("Add",new DialogInterface.OnClickListener(){
@Override
public void onClick(DialogInterface dialogInterface, int i) {
String fruitName = txtName.getText().toString();
listener.saveCategory(fruitName);
}
});
txtName = (EditText) view.findViewById(R.id.txtFruitName);
return builder.create();
}

@Override
public void onAttach(@NonNull Context context) {
super.onAttach(context);

try {
listener = (CategoryAddListener) context;
} catch (ClassCastException e) {
throw new ClassCastException(context.toString()+ "must implement CategoryAddFragmentListener");
}
}

public interface CategoryAddListener{
public void saveCategory(String name);
}
}
