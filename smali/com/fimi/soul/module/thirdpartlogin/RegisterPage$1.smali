.class Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->b:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;

    iput-object p2, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    const/4 v2, 0x0

    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->b:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;

    invoke-static {v3}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->a(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :goto_0
    :try_start_4
    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->b:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;

    invoke-static {v0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->b(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Lcom/fimi/soul/module/thirdpartlogin/f;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->b:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;

    invoke-static {v1}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->a(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/f;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->b:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;

    invoke-static {v0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->c(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1$1;-><init>(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :catch_2
    move-exception v0

    move-object v1, v2

    :goto_2
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_0

    :catch_3
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_3
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    :goto_4
    :try_start_9
    throw v0

    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_3

    :catch_5
    move-exception v0

    goto :goto_2
.end method
