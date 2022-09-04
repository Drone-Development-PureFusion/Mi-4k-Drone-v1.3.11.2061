.class Lcom/google/android/gms/drive/internal/br$g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/br;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Lcom/google/android/gms/drive/m;

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/m;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/br$g;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/br$g;->b:Lcom/google/android/gms/drive/m;

    iput-boolean p3, p0, Lcom/google/android/gms/drive/internal/br$g;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$g;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$g;->b:Lcom/google/android/gms/drive/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$g;->b:Lcom/google/android/gms/drive/m;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/m;->b()V

    :cond_0
    return-void
.end method

.method public c()Lcom/google/android/gms/drive/m;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$g;->b:Lcom/google/android/gms/drive/m;

    return-object v0
.end method
