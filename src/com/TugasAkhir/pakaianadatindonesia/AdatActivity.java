package com.TugasAkhir.pakaianadatindonesia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AdatActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adat);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.adat, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void openAceh(View V){
		Intent i = new Intent(getApplicationContext(),
				AcehActivity.class);
    	startActivity(i);
	}
	
	public void openBangka(View V){
		Intent i = new Intent(getApplicationContext(),
				BebelActivity.class);
    	startActivity(i);
	}
	
	public void openBali(View V){
		Intent i = new Intent(getApplicationContext(),
				BaliActivity.class);
    	startActivity(i);
	}
	
	public void openBanten(View V){
		Intent i = new Intent(getApplicationContext(),
				BantenActivity.class);
    	startActivity(i);
	}
	
	public void openBengkulu(View V){
		Intent i = new Intent(getApplicationContext(),
				BengkuluActivity.class);
    	startActivity(i);
	}
	
	public void openGorontalo(View V){
		Intent i = new Intent(getApplicationContext(),
				GorontaloActivity.class);
    	startActivity(i);
	}
	
	public void openJakarta(View V){
		Intent i = new Intent(getApplicationContext(),
				JakartaActivity.class);
    	startActivity(i);
	}
	
	public void openJambi(View V){
		Intent i = new Intent(getApplicationContext(),
				JambiActivity.class);
    	startActivity(i);
	}
	
	public void openJabar(View V){
		Intent i = new Intent(getApplicationContext(),
				JabarActivity.class);
    	startActivity(i);
	}
	public void openJateng(View V){
		Intent i = new Intent(getApplicationContext(),
				JatengActivity.class);
    	startActivity(i);
	}
	public void openJatim(View V){
		Intent i = new Intent(getApplicationContext(),
				JatimActivity.class);
    	startActivity(i);
	}
	public void openJogja(View V){
		Intent i = new Intent(getApplicationContext(),
				JogjaActivity.class);
    	startActivity(i);
	}
	
	public void openKalbar(View V){
		Intent i = new Intent(getApplicationContext(),
				KalimantanActivity.class);
    	startActivity(i);
	}
	public void openKalteng(View V){
		Intent i = new Intent(getApplicationContext(),
				KeltengActivity.class);
    	startActivity(i);
	}
	public void openKalsel(View V){
		Intent i = new Intent(getApplicationContext(),
				KalselActivity.class);
    	startActivity(i);
	}
	public void openKaltim(View V){
		Intent i = new Intent(getApplicationContext(),
				KaltimActivity.class);
    	startActivity(i);
	}
	public void openKalut(View V){
		Intent i = new Intent(getApplicationContext(),
				KalutActivity.class);
    	startActivity(i);
	}
	public void openLampung(View V){
		Intent i = new Intent(getApplicationContext(),
				LampungActivity.class);
    	startActivity(i);
	}
	public void openMaluku(View V){
		Intent i = new Intent(getApplicationContext(),
				MalukuActivity.class);
    	startActivity(i);
	}
	public void openMalukuutara(View V){
		Intent i = new Intent(getApplicationContext(),
				MalukuutaraActivity.class);
    	startActivity(i);
	}
	public void openNtb(View V){
		Intent i = new Intent(getApplicationContext(),
				NtbActivity.class);
    	startActivity(i);
	}
	public void openNTT(View V){
		Intent i = new Intent(getApplicationContext(),
				NttActivity.class);
    	startActivity(i);
	}
	public void openPapua(View V){
		Intent i = new Intent(getApplicationContext(),
				PapuaActivity.class);
    	startActivity(i);
	}
	public void openPapuabarat(View V){
		Intent i = new Intent(getApplicationContext(),
				PabarActivity.class);
    	startActivity(i);
	}
	public void openRiau(View V){
		Intent i = new Intent(getApplicationContext(),
				RiauActivity.class);
    	startActivity(i);
	}
	public void openSulber(View V){
		Intent i = new Intent(getApplicationContext(),
				SulbarActivity.class);
    	startActivity(i);
	}
	public void openSulsel(View V){
		Intent i = new Intent(getApplicationContext(),
				SulselActivity.class);
    	startActivity(i);
	}
	public void openSulteng(View V){
		Intent i = new Intent(getApplicationContext(),
				SultengActivity.class);
    	startActivity(i);
	}
	public void openSultenggara(View V){
		Intent i = new Intent(getApplicationContext(),
				SultenggaraActivity.class);
    	startActivity(i);
	}
	public void openSumsel(View V){
		Intent i = new Intent(getApplicationContext(),
				SumselActivity.class);
    	startActivity(i);
	}
	public void openSumut(View V){
		Intent i = new Intent(getApplicationContext(),
				SumutActivity.class);
    	startActivity(i);
	}
}
