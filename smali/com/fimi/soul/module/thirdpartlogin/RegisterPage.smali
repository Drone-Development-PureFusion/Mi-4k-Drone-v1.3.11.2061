.class public Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final a:I = 0x0

.field private static final b:I = 0x1

.field private static final c:I = 0x2

.field private static final d:I = 0x3

.field private static final e:Ljava/lang/String; = "UserIcon.jpg"

.field private static f:Lcom/fimi/soul/module/thirdpartlogin/d;

.field private static g:Ljava/lang/String;


# instance fields
.field private h:Lcom/fimi/soul/module/thirdpartlogin/d;

.field private i:Lcn/sharesdk/framework/Platform;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/EditText;

.field private o:Ljava/lang/String;

.field private p:Lcom/fimi/soul/module/thirdpartlogin/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, Lcom/fimi/soul/module/thirdpartlogin/f;

    invoke-direct {v0}, Lcom/fimi/soul/module/thirdpartlogin/f;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->o:Ljava/lang/String;

    return-object v0
.end method

.method private a()V
    .locals 4

    const/4 v3, 0x4

    const/4 v2, 0x0

    const-string v0, ""

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->i:Lcn/sharesdk/framework/Platform;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->i:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;

    move-result-object v0

    invoke-virtual {v0}, Lcn/sharesdk/framework/PlatformDb;->getUserGender()Ljava/lang/String;

    move-result-object v0

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    sget-object v1, Lcom/fimi/soul/module/thirdpartlogin/f$a;->a:Lcom/fimi/soul/module/thirdpartlogin/f$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->a(Lcom/fimi/soul/module/thirdpartlogin/f$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->i:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;

    move-result-object v1

    invoke-virtual {v1}, Lcn/sharesdk/framework/PlatformDb;->getUserIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->i:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;

    move-result-object v1

    invoke-virtual {v1}, Lcn/sharesdk/framework/PlatformDb;->getUserName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->i:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;

    move-result-object v1

    invoke-virtual {v1}, Lcn/sharesdk/framework/PlatformDb;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->c(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->n:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    invoke-virtual {v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    invoke-virtual {v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/thirdpartlogin/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->b()V

    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/download"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    const-string v0, "UserIcon.jpg"

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_2
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_1
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->o:Ljava/lang/String;

    const-string v0, "picturePath ==>>"

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    sget-object v1, Lcom/fimi/soul/module/thirdpartlogin/f$a;->b:Lcom/fimi/soul/module/thirdpartlogin/f$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->a(Lcom/fimi/soul/module/thirdpartlogin/f$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :cond_5
    const-string v0, "change user icon ==>>"

    const-string v1, "there is not sdcard!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2
.end method

.method static final a(Lcom/fimi/soul/module/thirdpartlogin/d;)V
    .locals 0

    sput-object p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->f:Lcom/fimi/soul/module/thirdpartlogin/d;

    return-void
.end method

.method static final a(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->g:Ljava/lang/String;

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Lcom/fimi/soul/module/thirdpartlogin/f;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    return-object v0
.end method

.method private b()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->i:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;

    move-result-object v0

    invoke-virtual {v0}, Lcn/sharesdk/framework/PlatformDb;->getUserIcon()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;

    invoke-direct {v2, p0, v0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;-><init>(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->j:Landroid/widget/ImageView;

    return-object v0
.end method

.method private c()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.PICK"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->o:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    if-ne p2, v1, :cond_1

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    const-string v1, "_data"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " == exist"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->j:Landroid/widget/ImageView;

    invoke-static {v1}, Lcom/fimi/soul/module/thirdpartlogin/e;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    if-ne p2, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->p:Lcom/fimi/soul/module/thirdpartlogin/f;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->o:Ljava/lang/String;

    invoke-static {v1}, Landroid/graphics/drawable/Drawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    if-ne p2, v1, :cond_0

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->j:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->o:Ljava/lang/String;

    invoke-static {v1}, Landroid/graphics/drawable/Drawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    const/4 v1, 0x0

    sget-object v0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->f:Lcom/fimi/soul/module/thirdpartlogin/d;

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->h:Lcom/fimi/soul/module/thirdpartlogin/d;

    sget-object v0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->g:Ljava/lang/String;

    invoke-static {v0}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->i:Lcn/sharesdk/framework/Platform;

    sput-object v1, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->f:Lcom/fimi/soul/module/thirdpartlogin/d;

    sput-object v1, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->g:Ljava/lang/String;

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->a()V

    return-void
.end method
