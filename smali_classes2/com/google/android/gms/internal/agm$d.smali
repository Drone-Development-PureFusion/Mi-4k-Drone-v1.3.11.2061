.class final Lcom/google/android/gms/internal/agm$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Lcom/google/android/gms/cast/a/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/a/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$d;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/agm$d;->b:Lcom/google/android/gms/cast/a/a;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$d;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/cast/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$d;->b:Lcom/google/android/gms/cast/a/a;

    return-object v0
.end method
