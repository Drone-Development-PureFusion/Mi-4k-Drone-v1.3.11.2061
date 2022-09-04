.class Lcom/google/android/gms/tagmanager/cm$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cm;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/cm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cm$2;->a:Lcom/google/android/gms/tagmanager/cm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm$2;->a:Lcom/google/android/gms/tagmanager/cm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cm;->e(Lcom/google/android/gms/tagmanager/cm;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/ad;->a()V

    return-void
.end method
