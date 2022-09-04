.class final Lcom/google/android/gms/awareness/snapshot/internal/j$7;
.super Lcom/google/android/gms/contextmanager/internal/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/contextmanager/internal/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/g;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$7;->a:I

    invoke-direct {p0, p1}, Lcom/google/android/gms/contextmanager/internal/c$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/contextmanager/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/awareness/snapshot/internal/j$7;->a(Lcom/google/android/gms/contextmanager/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/contextmanager/internal/d;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;

    iget v1, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$7;->a:I

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;-><init>(ILjava/util/ArrayList;)V

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/contextmanager/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;)V

    return-void
.end method
