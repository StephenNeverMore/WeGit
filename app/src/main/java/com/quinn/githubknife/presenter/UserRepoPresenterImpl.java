package com.quinn.githubknife.presenter;

import android.content.Context;

import com.quinn.githubknife.view.ListFragmentView;

/**
 * Created by Quinn on 7/23/15.
 */
public class UserRepoPresenterImpl extends PresenterAdapter{


    public UserRepoPresenterImpl(Context context, ListFragmentView view){
        super(context,view);
    }


    @Override
    public void onPageLoad(int page, String user){
        super.onPageLoad(page,user);
        interactor.loadRepo(user,page);
    }
}
