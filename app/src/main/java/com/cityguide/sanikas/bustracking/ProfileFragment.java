package com.cityguide.sanikas.bustracking;


import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    // Required empty public constructor
    private ImageView imgview, imgcam;
    private int Gallery = 1, Camera = 2;
    private Dialog openDialog;

    public ProfileFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DashboardActivity) getActivity()).setActionBarTitle("Profile");

        final View view = inflater.inflate(R.layout.fragment_profile, container, false);
        imgview = (ImageView) view.findViewById(R.id.img2);
        imgcam = (ImageView) view.findViewById(R.id.img1);

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }

            private void openDialog() {
                MyCustomDialog customDialog = new MyCustomDialog();
                customDialog.show(getFragmentManager(), "custom dialog");
            }
        });


        imgcam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPictureDialog();
            }

            private void showPictureDialog() {
                AlertDialog.Builder pictureDialog = new AlertDialog.Builder(getContext());
                pictureDialog.setTitle("Select Action");
                String[] pictureDialogItems = {"Select photo from Gallery", "Capture photo from camera"};
                pictureDialog.setItems(pictureDialogItems, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                choosePhotoFromGallery();
                                break;
                            case 1:
                                takePhotoFromCamera();
                                break;
                        }

                    }




                    private void choosePhotoFromGallery() {
                        Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        startActivityForResult(galleryIntent, Gallery);

                    }

                        private void takePhotoFromCamera() {

                            Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivityForResult(intent, Camera);

                            }
                });

            }

});




        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Activity.RESULT_OK) {
            if (requestCode == Camera) {

                Bitmap bmp = (Bitmap) data.getExtras().get("data");
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                imgcam.setImageBitmap(bitmap);
            } else if (requestCode == Gallery) {
                Uri selectedImageUri = data.getData();
                imgcam.setImageURI(selectedImageUri);
            }
        }
    }


}
