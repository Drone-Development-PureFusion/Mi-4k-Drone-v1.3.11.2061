.class final Lcom/google/android/gms/tagmanager/f$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/f;->a(Landroid/content/Context;)Lcom/google/android/gms/tagmanager/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/dq;)Lcom/google/android/gms/tagmanager/dm;
    .locals 7

    new-instance v0, Lcom/google/android/gms/tagmanager/dm;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/dm;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/dq;)V

    return-object v0
.end method
