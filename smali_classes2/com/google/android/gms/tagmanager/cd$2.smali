.class Lcom/google/android/gms/tagmanager/cd$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/cd$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cd;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/dq;Lcom/google/android/gms/tagmanager/cd$b;Lcom/google/android/gms/tagmanager/cd$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/cd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cd$2;->a:Lcom/google/android/gms/tagmanager/cd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tagmanager/dq;)Lcom/google/android/gms/tagmanager/cc;
    .locals 3

    new-instance v0, Lcom/google/android/gms/tagmanager/cc;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cd$2;->a:Lcom/google/android/gms/tagmanager/cd;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/cd;->a(Lcom/google/android/gms/tagmanager/cd;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/cd$2;->a:Lcom/google/android/gms/tagmanager/cd;

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/cd;->b(Lcom/google/android/gms/tagmanager/cd;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/tagmanager/cc;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/dq;)V

    return-object v0
.end method
