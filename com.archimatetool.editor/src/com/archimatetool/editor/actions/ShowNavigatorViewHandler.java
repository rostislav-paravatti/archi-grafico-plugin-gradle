package com.archimatetool.editor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.archimatetool.editor.ui.services.ViewManager;
import com.archimatetool.editor.views.navigator.INavigatorView;



/**
 * Command Handler to show Navigator View
 * 
 * @author Phillip Beauvoir
 */
public class ShowNavigatorViewHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ViewManager.toggleViewPart(INavigatorView.ID, true);
        return null;
    }

}
