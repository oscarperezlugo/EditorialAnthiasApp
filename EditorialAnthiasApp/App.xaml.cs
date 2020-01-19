using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace EditorialAnthiasApp
{
    public partial class App : Application
    {
        
        public App()
        {
            Syncfusion.Licensing.SyncfusionLicenseProvider.RegisterLicense("MTc5NTI2QDMxMzcyZTMzMmUzMFZGMzZoRVFzR0R3QUYzS3pUYm5Zd0VwdkdFa0lxNHlSRHVDeFlsNFNQKzQ9");
            InitializeComponent();

            MainPage = new ReadPage();
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}
