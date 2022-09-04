.class public Lcom/google/android/gms/internal/aek;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/appinvite/d;


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aek;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/aek;->b:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aek;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aek;->b:Landroid/content/Intent;

    return-object v0
.end method
