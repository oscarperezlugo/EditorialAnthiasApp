package md51a8bb9e0e024d2b73a16adf3de27281f;


public class DropDownButton
	extends android.widget.Button
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.SfPdfViewer.XForms.Droid.DropDownButton, Syncfusion.SfPdfViewer.XForms.Android", DropDownButton.class, __md_methods);
	}


	public DropDownButton (android.content.Context p0)
	{
		super (p0);
		if (getClass () == DropDownButton.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfPdfViewer.XForms.Droid.DropDownButton, Syncfusion.SfPdfViewer.XForms.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public DropDownButton (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == DropDownButton.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfPdfViewer.XForms.Droid.DropDownButton, Syncfusion.SfPdfViewer.XForms.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public DropDownButton (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == DropDownButton.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfPdfViewer.XForms.Droid.DropDownButton, Syncfusion.SfPdfViewer.XForms.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
