.class Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/h;

.field final synthetic b:Lcom/google/android/gms/cast/framework/media/h;

.field final synthetic c:Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;Lcom/google/android/gms/cast/framework/media/h;Lcom/google/android/gms/cast/framework/media/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment$2;->c:Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment$2;->a:Lcom/google/android/gms/cast/framework/media/h;

    iput-object p3, p0, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment$2;->b:Lcom/google/android/gms/cast/framework/media/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment$2;->c:Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment$2;->a:Lcom/google/android/gms/cast/framework/media/h;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment$2;->b:Lcom/google/android/gms/cast/framework/media/h;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;->a(Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;Lcom/google/android/gms/cast/framework/media/h;Lcom/google/android/gms/cast/framework/media/h;)V

    return-void
.end method
